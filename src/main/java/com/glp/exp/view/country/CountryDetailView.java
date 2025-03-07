package com.glp.exp.view.country;

import com.glp.exp.entity.Country;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "countries/:id", layout = DefaultMainViewParent.class)
@ViewController(id = "Country.detail")
@ViewDescriptor(path = "country-detail-view.xml")
@EditedEntityContainer("countryDc")
public class CountryDetailView extends StandardDetailView<Country> {
}