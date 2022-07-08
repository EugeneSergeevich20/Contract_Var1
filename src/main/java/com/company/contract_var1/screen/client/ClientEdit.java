package com.company.contract_var1.screen.client;

import io.jmix.ui.Dialogs;
import io.jmix.ui.app.inputdialog.DialogActions;
import io.jmix.ui.app.inputdialog.DialogOutcome;
import io.jmix.ui.app.inputdialog.InputParameter;
import io.jmix.ui.component.HasContextHelp;
import io.jmix.ui.component.TextField;
import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {

    @Autowired
    private TextField<String> addressField;

    @Autowired
    private TextField<String> fullNameField;
    @Autowired
    private Dialogs dialogs;

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

    @Install(to = "fullNameField", subject = "contextHelpIconClickHandler")
    private void fullNameFieldContextHelpIconClickHandler(HasContextHelp.ContextHelpIconClickEvent contextHelpIconClickEvent) {

        dialogs.createInputDialog(this)
                .withCaption("Get values")
                .withParameters(
                        InputParameter.stringParameter("firstName")
                                .withCaption("Фамилия:"),
                        InputParameter.stringParameter("lastName")
                                .withCaption("Имя:"),
                        InputParameter.stringParameter("patronymic")
                                .withCaption("Отчество:")
                )
                .withActions(DialogActions.OK_CANCEL)
                .withCloseListener(closeEvent -> {
                    if (closeEvent.closedWith(DialogOutcome.OK)) {
                        String firstName = closeEvent.getValue("firstName");
                        String lastName = closeEvent.getValue("lastName");
                        String patronymic = closeEvent.getValue("patronymic");
                        fullNameField.setValue(firstName + " " + lastName + " " +
                                patronymic);
                    }
                })
                .show();

    }
}