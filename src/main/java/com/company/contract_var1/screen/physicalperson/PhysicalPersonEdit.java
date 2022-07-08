package com.company.contract_var1.screen.physicalperson;

import io.jmix.ui.Dialogs;
import io.jmix.ui.app.inputdialog.DialogActions;
import io.jmix.ui.app.inputdialog.DialogOutcome;
import io.jmix.ui.app.inputdialog.InputParameter;
import io.jmix.ui.component.HasContextHelp;
import io.jmix.ui.component.TextField;
import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.PhysicalPerson;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("PhysicalPerson.edit")
@UiDescriptor("physical-person-edit.xml")
@EditedEntityContainer("physicalPersonDc")
public class PhysicalPersonEdit extends StandardEditor<PhysicalPerson> {

    @Autowired
    private Dialogs dialogs;

    @Autowired
    private TextField<String> addressField;

    @Install(to = "addressField", subject = "contextHelpIconClickHandler")
    private void addressFieldContextHelpIconClickHandler(HasContextHelp.ContextHelpIconClickEvent contextHelpIconClickEvent) {
        dialogs.createInputDialog(this)
                .withCaption("Get values")
                .withParameters(
                        InputParameter.stringParameter("city")
                                .withCaption("City:"),
                        InputParameter.stringParameter("street")
                                .withCaption("Street:"),
                        InputParameter.stringParameter("building")
                                .withCaption("Building:"),
                        InputParameter.intParameter("number")
                                .withCaption("Number:")
                )
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener(closeEvent -> {
                    if (closeEvent.closedWith(DialogOutcome.OK)) {
                        String city = closeEvent.getValue("city");
                        String street = closeEvent.getValue("street");
                        String building = closeEvent.getValue("building");
                        Integer number = closeEvent.getValue("number");
                        addressField.setValue(city + ", " + street + ", " +
                                building + ", " + number);
                    }
                })
                .show();
    }
}