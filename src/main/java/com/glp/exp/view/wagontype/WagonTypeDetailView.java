package com.glp.exp.view.wagontype;

import com.glp.exp.entity.WagonType;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "wagon-types/:id", layout = DefaultMainViewParent.class)
@ViewController(id = "WagonType.detail")
@ViewDescriptor(path = "wagon-type-detail-view.xml")
@EditedEntityContainer("wagonTypeDc")
public class WagonTypeDetailView extends StandardDetailView<WagonType> {
}