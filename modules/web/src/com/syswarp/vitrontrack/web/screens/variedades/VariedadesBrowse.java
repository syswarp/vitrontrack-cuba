package com.syswarp.vitrontrack.web.screens.variedades;

import com.haulmont.cuba.gui.screen.*;
import com.syswarp.vitrontrack.entity.Variedades;

@UiController("vitrontrack_Variedades.browse")
@UiDescriptor("variedades-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class VariedadesBrowse extends MasterDetailScreen<Variedades> {
}