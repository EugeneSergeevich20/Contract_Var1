package com.company.contract_var1.screen.contractorwithcontract;

import com.company.contract_var1.entity.Client;
import com.company.contract_var1.entity.Contract;
import com.company.contract_var1.entity.Contractor;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("ContractorWithContractScreen")
@UiDescriptor("ContractorWithContract-screen.xml")
public class ContractorWithContractScreen extends Screen {

    @Autowired
    private CollectionLoader<Contract> contractDl;

    @Autowired
    private CollectionLoader<Contractor> contractorDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        contractorDl.load();
    }

    @Subscribe(id = "contractorDc", target = Target.DATA_CONTAINER)
    public void onContractorDcItemChange(InstanceContainer.ItemChangeEvent<Contractor> event) {

        contractDl.setParameter("id", event.getItem());
        contractDl.load();

    }

}