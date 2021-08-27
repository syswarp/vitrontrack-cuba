package com.syswarp.vitrontrack.web.screens.producciones;

import com.haulmont.cuba.gui.screen.*;
import com.syswarp.vitrontrack.entity.Producciones;

@UiController("vitrontrack_Producciones.browse")
@UiDescriptor("producciones-browse.xml")
@LookupComponent("produccionesesTable")
@LoadDataBeforeShow
public class ProduccionesBrowse extends StandardLookup<Producciones> {
}