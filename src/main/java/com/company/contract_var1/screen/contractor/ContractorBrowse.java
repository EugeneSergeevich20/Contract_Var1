package com.company.contract_var1.screen.contractor;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.Contractor;

@UiController("Contractor.browse")
@UiDescriptor("contractor-browse.xml")
@LookupComponent("contractorsTable")
public class ContractorBrowse extends StandardLookup<Contractor> {
}