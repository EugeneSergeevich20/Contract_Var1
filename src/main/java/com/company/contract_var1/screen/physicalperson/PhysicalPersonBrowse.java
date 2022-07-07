package com.company.contract_var1.screen.physicalperson;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.PhysicalPerson;

@UiController("PhysicalPerson.browse")
@UiDescriptor("physical-person-browse.xml")
@LookupComponent("physicalPersonsTable")
public class PhysicalPersonBrowse extends StandardLookup<PhysicalPerson> {
}