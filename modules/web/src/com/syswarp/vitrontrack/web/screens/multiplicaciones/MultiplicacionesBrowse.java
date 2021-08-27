package com.syswarp.vitrontrack.web.screens.multiplicaciones;

import com.haulmont.cuba.gui.screen.*;
import com.syswarp.vitrontrack.entity.Multiplicaciones;

@UiController("vitrontrack_Multiplicaciones.browse")
@UiDescriptor("multiplicaciones-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class MultiplicacionesBrowse extends MasterDetailScreen<Multiplicaciones> {
}