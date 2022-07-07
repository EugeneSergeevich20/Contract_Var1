package com.company.contract_var1.screen.clientwithcontract;

import com.company.contract_var1.entity.Client;
import com.company.contract_var1.entity.Contract;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("ClientWithContractScreen")
@UiDescriptor("clientWithContract-screen.xml")
public class ClientwithcontractScreen extends Screen {

    @Autowired
    private CollectionLoader<Client> clientDl;

    @Autowired
    private CollectionLoader<Contract> contractDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        clientDl.load();
    }

    @Subscribe(id = "clientDc", target = Target.DATA_CONTAINER)
    public void onClientDcItemChange(InstanceContainer.ItemChangeEvent<Client> event) {

        contractDl.setParameter("id", event.getItem());
        contractDl.load();

    }
}