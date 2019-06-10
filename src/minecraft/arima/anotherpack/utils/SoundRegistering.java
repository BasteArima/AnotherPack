package arima.anotherpack.utils;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import arima.anotherpack.core.Main;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundRegistering {
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		try {
			String[] soundFiles = { "Coup_de_Grace.ogg", "scythe_hit_1_.ogg", "scythe_hit_2_.ogg", "scythe_hit_3_.ogg",
					"Stifling_Dagger.ogg", "rwby.ogg" };
			for (int i = 0; i < soundFiles.length; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:" + soundFiles[i],
						Main.class.getResource("/mods/anotherpack/sound/Scythe/" + soundFiles[i]));
			}
			
			String[] soundFiles2 = { "Phass_anger_04_ru.ogg", "Phass_arc_happy_07_ru.ogg", "Phass_happy_08_ru.ogg",
					"Phass_happy_09_ru.ogg", "Phass_pain_01_ru.ogg", "Phass_pain_02_ru.ogg" };
			for (int i = 0; i < soundFiles2.length; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:" + soundFiles2[i],
						Main.class.getResource("/mods/anotherpack/sound/fan/" + soundFiles2[i]));
			}

			String[] soundFiles3 = { "Phass_pain_03_ru.ogg", "Phass_pain_04_ru.ogg", "Phass_pain_05_ru.ogg",
					"Phass_pain_06_ru.ogg", "Phass_pain_07_ru.ogg", "Phass_pain_08_ru.ogg" };
			for (int i = 0; i < soundFiles3.length; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:" + soundFiles3[i],
						Main.class.getResource("/mods/anotherpack/sound/fan/" + soundFiles3[i]));
			}

			String[] soundFiles4 = { "Phass_pain_09_ru.ogg", "Temp_pain_01_ru.ogg", "Temp_pain_02_ru.ogg",
					"Temp_pain_03_ru.ogg", "Temp_pain_04_ru.ogg", "Temp_pain_05_ru.ogg" };
			for (int i = 0; i < soundFiles4.length; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:" + soundFiles4[i],
						Main.class.getResource("/mods/anotherpack/sound/fan/" + soundFiles4[i]));
			}

			String[] soundFiles5 = { "Temp_pain_06_ru.ogg", "Temp_pain_07_ru.ogg", "Temp_pain_08_ru.ogg", "yula1_.ogg", "yula2_.ogg" };
			for (int i = 0; i < soundFiles5.length; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:" + soundFiles5[i],
						Main.class.getResource("/mods/anotherpack/sound/fan/" + soundFiles5[i]));
			}
			
			String[] soundFiles6 = { "whip1_.ogg", "whip2_.ogg", "whip3_.ogg", "whip4_.ogg", "whip5_.ogg" };
			for (int i = 0; i < soundFiles6.length; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:" + soundFiles6[i],
						Main.class.getResource("/mods/anotherpack/sound/fan/" + soundFiles6[i]));
			}
			
			String[] soundFiles7 = { "Box_Leg_Open.ogg", "Migalka.ogg" };
			for (int i = 0; i < soundFiles7.length; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:" + soundFiles7[i],
						Main.class.getResource("/mods/anotherpack/sound/" + soundFiles7[i]));
			}

			for (int i = 0; i < 71; i++) {
				event.manager.soundPoolSounds.addSound("anotherpack:nastya_ ("+i+").ogg",
						Main.class.getResource("/mods/anotherpack/sound/fan/nastya/nastya_ ("+i+").ogg"));
			}

		} catch (Exception e) {
			System.err.println("AnotherPack: Ошибка регистрации звука!");
		}
	}
}