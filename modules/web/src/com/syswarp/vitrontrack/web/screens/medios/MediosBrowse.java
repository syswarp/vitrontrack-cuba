package com.syswarp.vitrontrack.web.screens.medios;

import com.haulmont.cuba.gui.screen.*;
import com.syswarp.vitrontrack.entity.Medios;

@UiController("vitrontrack_Medios.browse")
@UiDescriptor("medios-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class MediosBrowse extends MasterDetailScreen<Medios> {
}