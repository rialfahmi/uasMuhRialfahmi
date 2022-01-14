package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Semut;
import simple.example.hewanpedia.model.Ular;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.anggora_nama),ctx.getString(R.string.anggora_asal),
                ctx.getString(R.string.anggora_deskripsi),R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama),ctx.getString(R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama),ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama),ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama),ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi) , R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia_nama),ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }


    private static List<Semut> initDataSemut(Context ctx) {
        List<Semut> semuts = new ArrayList<>();
        semuts.add(new Semut(ctx.getString(R.string.ochetellus_nama),ctx.getString(R.string.ochetellus_asal),
                ctx.getString(R.string.ochetellus_deskripsi), R.drawable.semut_ochetellus));
        semuts.add(new Semut(ctx.getString(R.string.solenopsis_spp_nama),ctx.getString(R.string.solenopsis_spp_asal),
                ctx.getString(R.string.solenopsis_spp_deskripsi), R.drawable.semut_solenopsis_spp));
        semuts.add(new Semut(ctx.getString(R.string.tapinoma_melanocephalum_nama),ctx.getString(R.string.tapinoma_melanocephalum_asal),
                ctx.getString(R.string.tapinoma_melanocephalum_deskripsi), R.drawable.semut_tapinoma_melanocephalum));
        semuts.add(new Semut(ctx.getString(R.string.tapinoma_melanocephalum_nama),ctx.getString(R.string.tapinoma_melanocephalum_asal),
                ctx.getString(R.string.tapinoma_melanocephalum_deskripsi), R.drawable.semut_tapinoma_sessile));
        semuts.add(new Semut(ctx.getString(R.string.monomorium_pharaonis_nama),ctx.getString(R.string.monomorium_pharaonis_asal),
                ctx.getString(R.string.monomorium_pharaonis_deskripsi), R.drawable.semut_monomorium_pharaonis));
        semuts.add(new Semut(ctx.getString(R.string.camponotus_ennsylvanicus_nama),ctx.getString(R.string.camponotus_pennsylvanicus_asal),
                ctx.getString(R.string.camponotus_pennsylvanicus_deskripsi), R.drawable.semut_componotus_pennsylvanicus));
        return semuts;
    }
    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular(ctx.getString(R.string.ular_sanca_nama),ctx.getString(R.string.ular_sanca_asal),
                ctx.getString(R.string.ular_sanca_deskripsi), R.drawable.ular_sanca));
        ulars.add(new Ular(ctx.getString(R.string.ular_kobra_nama),ctx.getString(R.string.ular_kobra_asal),
                ctx.getString(R.string.ular_kobra_deskripsi), R.drawable.ular_kobra));
        ulars.add(new Ular(ctx.getString(R.string.ular_welang_nama),ctx.getString(R.string.ular_welang_asal),
                ctx.getString(R.string.ular_welang_deskripsi), R.drawable.ular_welang));
        ulars.add(new Ular(ctx.getString(R.string.ular_pucuk_nama),ctx.getString(R.string.ular_pucuk_asal),
                ctx.getString(R.string.ular_pucuk_deskripsi), R.drawable.ular_pucuk));
        return ulars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataSemut(ctx));
        hewans.addAll(initDataUlar(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
