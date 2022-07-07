package com.company.contract_var1.screen.contract;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.Contract;

@UiController("Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
public class ContractEdit extends StandardEditor<Contract> {
}