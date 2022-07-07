package com.company.contract_var1.screen.client;

import io.jmix.ui.screen.*;
import com.company.contract_var1.entity.Client;

@UiController("Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
public class ClientBrowse extends StandardLookup<Client> {
}