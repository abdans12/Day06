package com.example.day06;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterLaptop adapterLaptop;
    private ArrayList<ModelLaptop> modelLaptop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.laptops);
        adapterLaptop = new AdapterLaptop(modelLaptop);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterLaptop);

        adapterLaptop.setOnItemClickListener(new AdapterLaptop.OnItemClickListener() {
            @Override
            public void onItemClick(ModelLaptop model) {

                Intent intent = new Intent(MainActivity.this, detailactivity.class);

                intent.putExtra("nama_barang", model.getNamaLaptop());
                intent.putExtra("deskripsi_barang", getDeskripsi(model.getNamaLaptop()));
                intent.putExtra("harga_barang", getHarga(model.getNamaLaptop()));
                intent.putExtra("gambar_barang", model.getGambarLaptop());
                startActivity(intent);
            }
        });
    }

    private void getData() {
        modelLaptop = new ArrayList<>();
        modelLaptop.add(new ModelLaptop("Axioo MyBook 14+ productnation", R.drawable.axioomybook14, "Intel N3350 1.1Ghz up to 2.4GHz, RAM 8GB, 512GB SSD,  14 Inch FHD, DOS OS, Display: 14 inch Full HD (1920 x 1080 pixels), ", 3999999));
        modelLaptop.add(new ModelLaptop("Xiaomi Redmibook 15 productnation", R.drawable.xiaomiredmibookprop, "11th Generation Intel® Core™ i5-11300H (up to 4.4 GHz, 4 Cores, 8 Threads, 8 MB Cache), Intel® UHD Graphics, DDR4 8 GB 3200MHz, SSD 256 GB, 720PHD, Kapasitas Terukur: 46Wh.", 7499000));
        modelLaptop.add(new ModelLaptop("MSI Titan GT77", R.drawable.msititangt77, "Intel® Core™ i9-13980HX processor, GeForce RTX 4090 Mobile 16GB, RAM128 GB, 99.9Whr, Up to 13th Gen Intel® Core™ i9 HX Processor, 17.3\" QHD (2560x1440), 240Hz, IPS-Level, 17.3 UHD (3840x2160), MiniLED, HDR 1000, 144Hz, IPS-Level, NVIDIA® GeForce RTX™ 4090 Laptop GPU 16GB GDDR6, Up to 2040MHz Boost Clock 175W Maximum Graphics Power with Dynamic Boost. *May vary by scenario, Full-Power GPU Design", 60300000));
        modelLaptop.add(new ModelLaptop("ROG Mothership GZ700", R.drawable.rogmothershipgz700, " Intel® Core™ i9-9980HK Processor 2.4 GHz (16M Cache, up to 5.0 GHz, 8 cores), Windows 10 Home - ASUS recommends Windows 11 Pro for business.\n" +
                "\n" +
                "NVIDIA GeForceRTX 2080 8GB DDR6, Display 4K UHD( 3840 x2160), memory 16GB DDR4, storage 512 SSD, 1080P FHD Camera.", 97200000));
        modelLaptop.add(new ModelLaptop("Dell Alienware M17 R3", R.drawable.dellalienwarem17r3, "Intel Core i910980HK, 3840x2160(OLED),  GeForce RTX 2080 Super Mobile, 32 GB, 1 TB SSD.\n" +
                "\n", 66900000));
        modelLaptop.add(new ModelLaptop("HP Omen 15T", R.drawable.hpomen15t1, "Intel® Core™ i9 9880H , NVIDIA® GeForce® GTX 1660 Ti DDR6, 32 GB DDR4-2666 SDRAM .\n" +
                "\n" +
                "GPU Geforce RTX 2080 Max-Q.\n", 40600000));
        modelLaptop.add(new ModelLaptop("Acer Predator Helios 700", R.drawable.acerpredatorhelios700, "Intel Core i9-9980HK (16MB cache, up to 5.00Ghz), NVIDIA® GeForce RTX™ 2080 / RTX 2070, 430 (W) X 299 (D) X 41.7 (H) mm, NVIDIA® G-SYNC®, 1920 x 1080 Full HD, 144 refresh, 64GB DDR4, 2TB SSD. ", 60000000));
        modelLaptop.add(new ModelLaptop("Alienware M15", R.drawable.alienwarem15, "Intel® Core™ i9, 11800H, 4.6 GHz, Windows 10 Home, SSD M2, 512 GB, 24 MB, 16 GB RAM, 3200 MHz, DDR4 (2 slot), 1 TB SSD M.2 NVMe PCIe.\n" +
                "\n" +
                "NVIDIA GeForce RTX 3060 Laptop GPU dengan 6 GB GDDR6, Menggunakan modul Intel Killer Wi-Fi 6 AX1650i, battery 86 Wh, Resolusi QHD 2560 x 1440 Pixel dengan Aspect Ratio 16:9 .", 84000000));
        modelLaptop.add(new ModelLaptop("CUK MSI G575 Stealth", R.drawable.cukmsig575stealth, "Core i7-9750H 2.6 - 4.5GHz, 17.3\" FHD (1920x1080), 144Hz 3ms, IPS-Level, 1920x1080 (16:9), 8G GDDR6, GPU NVIDIA GeForce RTX™ 2070 Max Q.\n" +
                "\n" +
                "1TB NVMe SSD, 16GB (8G*2) DDR4 2666MHz, 720p HD Webcam, Battery 4 cell (82Whr).", 35000000));
        modelLaptop.add(new ModelLaptop("Gigabyte Aorus 17G", R.drawable.gigabyteaorus17gb, "11th Gen. Intel® Core™ i7 Processor H-Series, NVIDIA® GeForce RTX™ 30 Series Laptop GPUs, WINDFORCE infinity Cooling System, 17.3” FHD 300Hz NTSC 72% IPS Panel, Supports PCIe Gen4 SSD, Display 17.3\" Thin Bezel FHD 1920x1080 IPS-level Anti-glare Display LCD (300Hz, 72% NTSC), 2x DDR4 slots (DDR4-3200, Max 64GB), Li Polymer 99Wh", 30000000));
        modelLaptop.add(new ModelLaptop("Razer Blade 15", R.drawable.razerblade15, "Intel® Core™ i7-8750HQ Processor (2.20 – 4.10 GHz), Intel HD Graphics 630 iGPU, 16GB up to 64GB, DDR4, SSD 512GB, GPU Nvidia Geforce GTX 1070, 4K HD 3840 x 2160 piksel, Battery 80Wh Lithium-ion Polymer", 43300000));
        modelLaptop.add(new ModelLaptop("ASUS TUF GAMING F15", R.drawable.asustufgamingf15, " Intel Core i5-10300H Quad Core up to 4.5 GHz (8MB Cache), 8GB DDR4 SO-DIMM,  512 GB PCIe NVMe M.2 SSD.\n" +
                "\n" +
                "NVIDIA GeForce GTX 1650 4GB GDDR6,  IPS LCD, 15.6 inci Full HD 1920 x 1080 piksel, Refresh Rate 144Hz, 720p HD Camera, 720p HD Camera,  48 WHrs\n.",  11799000));
        modelLaptop.add(new ModelLaptop("Hp Victus Gaming 15", R.drawable.hpvictusgaming, "AMD Ryzen 5 5600H Hexa Core up to 4.2 GHz (16MB Cache), 16GB DDR4,  512 GB PCIe NVMe SSD, NVIDIA GeForce RTX 3050 4GB GDDR6, IPS-Level, 15.6 inci Full HD 1920 x 1080 piksel, Refresh Rate 144Hz, 720p HD Camera, 70 WHrs.\n" +
                "\n", 11799000));
        modelLaptop.add(new ModelLaptop("Lenovo Ideapad Gaming 3", R.drawable.lenovoideapadgaming3, "AMD Ryzen 5 5600H Hexa Core up to 4.2 GHz (16MB Cache), 8GB DDR4-3200, 512 GB PCIe NVMe M.2 SSD, NVIDIA GeForce RTX 3050 4GB GDDR6, IPS-Level, 15.6 inci Full HD 1920 x 1080 piksel, Refresh Rate 165Hz, 720p HD with Camera Shutter, 45 WHrs.\n" +
                "\n", 12299000));
        modelLaptop.add(new ModelLaptop("HP Pavilion Gaming 15", R.drawable.hppaviliongaming15, "AMD Ryzen 5 5600H Hexa Core up to 4.2 GHz (16MB Cache), NVIDIA GeForce GTX 1650 4GB GDDR6, 16GB DDR4,  512 GB NVMe SSD, IPS-Level, 15.6 inci Full HD 1920 x 1080 piksel, Refresh Rate 144Hz,  720p HD Camera, 51 WHrs .\n" +
                "\n", 13999000));
    }

    private String getDeskripsi(String namaLaptop) {
        for (ModelLaptop laptop : modelLaptop) {
            if (laptop.getNamaLaptop().equals(namaLaptop)) {
                return laptop.getDeskripsiLaptop();
            }
        }
        return "";
    }

    private double getHarga(String namaLaptop) {
        for (ModelLaptop laptop : modelLaptop) {
            if (laptop.getNamaLaptop().equals(namaLaptop)) {
                return laptop.getHargaLaptop();
            }
        }
        return 0.0;
    }
}