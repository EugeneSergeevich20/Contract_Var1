package com.company.contract_var1.screen.legalperson;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.LegalPerson;

@UiController("LegalPerson.edit")
@UiDescriptor("legal-person-edit.xml")
@EditedEntityContainer("legalPersonDc")
public class LegalPersonEdit extends StandardEditor<LegalPerson> {
}