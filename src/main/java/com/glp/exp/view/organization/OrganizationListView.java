package com.glp.exp.view.organization;

import com.glp.exp.entity.Organization;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "organizations", layout = DefaultMainViewParent.class)
@ViewController(id = "Organization.list")
@ViewDescriptor(path = "organization-list-view.xml")
@LookupComponent("organizationsDataGrid")
@DialogMode(width = "64em")
public class OrganizationListView extends StandardListView<Organization> {
}