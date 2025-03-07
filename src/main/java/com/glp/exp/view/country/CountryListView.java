package com.glp.exp.view.country;

import com.glp.exp.entity.Country;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "countries", layout = DefaultMainViewParent.class)
@ViewController(id = "Country.list")
@ViewDescriptor(path = "country-list-view.xml")
@LookupComponent("countriesDataGrid")
@DialogMode(width = "64em")
public class CountryListView extends StandardListView<Country> {
}