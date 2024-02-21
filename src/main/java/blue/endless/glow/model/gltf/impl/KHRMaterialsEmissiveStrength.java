package blue.endless.glow.model.gltf.impl;

import org.jetbrains.annotations.Nullable;

import blue.endless.glow.model.gltf.GLTFLoader;

// Refer to https://github.com/KhronosGroup/glTF/tree/main/extensions/2.0/Khronos/KHR_materials_emissive_strength
public class KHRMaterialsEmissiveStrength {
	public float emissiveStrength = 1;

	public KHRMaterialsEmissiveStrength() {
	}

	public static @Nullable KHRMaterialsEmissiveStrength get(GLTFData.GLTFMaterial material) {
		if (material.extensions == null) return null;
		return GLTFLoader.GSON.fromJson(material.extensions.get("KHR_materials_emissive_strength"),
			KHRMaterialsEmissiveStrength.class);
	}
}
