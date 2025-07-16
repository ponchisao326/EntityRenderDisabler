package com.victorgponce.entityrenderdisablerrewritefabric.client.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.victorgponce.entityrenderdisablerrewritefabric.client.config.YACLIntegration;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return YACLIntegration::createConfigScreen;
    }
}