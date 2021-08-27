package com.syswarp.vitrontrack.web.screens.contenedores;

import com.haulmont.cuba.gui.screen.*;
import com.syswarp.vitrontrack.entity.Contenedores;

@UiController("vitrontrack_Contenedores.browse")
@UiDescriptor("contenedores-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ContenedoresBrowse extends MasterDetailScreen<Contenedores> {
}