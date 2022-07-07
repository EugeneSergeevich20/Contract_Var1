package com.company.contract_var1.screen.contract;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.Contract;

@UiController("Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
public class ContractBrowse extends StandardLookup<Contract> {
}