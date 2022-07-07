package com.company.contract_var1.screen.physicalperson;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.PhysicalPerson;

@UiController("PhysicalPerson.edit")
@UiDescriptor("physical-person-edit.xml")
@EditedEntityContainer("physicalPersonDc")
public class PhysicalPersonEdit extends StandardEditor<PhysicalPerson> {
}