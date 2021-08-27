package com.syswarp.vitrontrack.web.screens.producciones;

import com.haulmont.cuba.gui.screen.*;
import com.syswarp.vitrontrack.entity.Producciones;

@UiController("vitrontrack_Producciones.edit")
@UiDescriptor("producciones-edit.xml")
@EditedEntityContainer("produccionesDc")
@LoadDataBeforeShow
public class ProduccionesEdit extends StandardEditor<Producciones> {
}