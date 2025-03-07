package com.glp.exp.view.organization;

import com.glp.exp.entity.Organization;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "organizations/:id", layout = DefaultMainViewParent.class)
@ViewController(id = "Organization.detail")
@ViewDescriptor(path = "organization-detail-view.xml")
@EditedEntityContainer("organizationDc")
public class OrganizationDetailView extends StandardDetailView<Organization> {
}