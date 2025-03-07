package com.glp.exp.view.wagontype;

import com.glp.exp.entity.WagonType;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "wagon-types", layout = DefaultMainViewParent.class)
@ViewController(id = "WagonType.list")
@ViewDescriptor(path = "wagon-type-list-view.xml")
@LookupComponent("wagonTypesDataGrid")
@DialogMode(width = "64em")
public class WagonTypeListView extends StandardListView<WagonType> {
}