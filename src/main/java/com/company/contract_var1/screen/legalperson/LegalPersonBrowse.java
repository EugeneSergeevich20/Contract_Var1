package com.company.contract_var1.screen.legalperson;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.LegalPerson;

@UiController("LegalPerson.browse")
@UiDescriptor("legal-person-browse.xml")
@LookupComponent("legalPersonsTable")
public class LegalPersonBrowse extends StandardLookup<LegalPerson> {
}