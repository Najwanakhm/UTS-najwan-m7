package com.example.uts_Najwan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_najwan.mobil

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobilList = listOf<mobil>(
            mobil(
                R.drawable.mobil1,
                namemobil =  "Agya",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota Agya:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 3.600 mm\n" +
                        "Lebar: 1.620 mm\n" +
                        "Tinggi: 1.500 mm\n" +
                        "Jarak sumbu roda: 2.450 mm\n" +
                        "Ground clearance: 180 mm\n" +
                        "Berat kosong: 770 - 790 kg\n" +
                        "Kapasitas tangki bahan bakar: 33 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 3 silinder, 12 katup, DOHC, VVT-i\n" +
                        "Kapasitas mesin: 998 cc\n" +
                        "Tenaga maksimum: 66 PS/6.000 rpm\n" +
                        "Torsi maksimum: 89 Nm/4.400 rpm\n" +
                        "Sistem bahan bakar: EFI\n" +
                        "Sistem pendinginan: liquid cooled\n" +
                        "Transmisi: manual 5 percepatan atau otomatis 4 percepatan\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: McPherson strut dengan stabilizer\n" +
                        "Suspensi belakang: torsion beam\n" +
                        "Rem depan: cakram ventilasi\n" +
                        "Rem belakang: tromol\n" +
                        "Ukuran ban: 175/65 R14 atau 185/60 R15\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Dual SRS airbag\n" +
                        "ABS\n" +
                        "EBD\n" +
                        "Rem cakram depan\n" +
                        "Immobilizer\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC\n" +
                        "Power steering\n" +
                        "Power window\n" +
                        "Jok belakang yang dapat dilipat\n" +
                        "Head unit audio dengan layar sentuh, USB, dan Bluetooth\n" +
                        "Konsol tengah dengan tempat penyimpanan dan cup holder\n" +
                        "Spion elektrik\n" +
                        "Lampu baca depan dan belakang\n" +
                        "Lampu kabin\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan halogen\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 14\" atau 15\"\n" +
                        "Spoiler belakang\n" +
                        "Antena roof mounted\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil2,
                namemobil =  "Avanza",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota Avanza:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.190 mm\n" +
                        "Lebar: 1.660 mm\n" +
                        "Tinggi: 1.695 mm\n" +
                        "Jarak sumbu roda: 2.655 mm\n" +
                        "Ground clearance: 200 mm\n" +
                        "Berat kosong: 1.110 - 1.150 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 45 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, 16 katup, DOHC, Dual VVT-i\n" +
                        "Kapasitas mesin: 1.318 cc atau 1.496 cc (tergantung varian)\n" +
                        "Tenaga maksimum: 95 - 104 PS/6.000 rpm\n" +
                        "Torsi maksimum: 121 - 136 Nm/4.200 rpm\n" +
                        "Sistem bahan bakar: EFI\n" +
                        "Sistem pendinginan: liquid cooled\n" +
                        "Transmisi: manual 5 percepatan atau otomatis 4 atau 5 percepatan\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: McPherson strut dengan stabilizer\n" +
                        "Suspensi belakang: torsion beam\n" +
                        "Rem depan: cakram ventilasi\n" +
                        "Rem belakang: tromol\n" +
                        "Ukuran ban: 185/65 R15 atau 185/70 R14\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Dual SRS airbag\n" +
                        "ABS\n" +
                        "EBD\n" +
                        "Rem cakram depan\n" +
                        "Immobilizer\n" +
                        "Alarm\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC\n" +
                        "Power steering\n" +
                        "Power window\n" +
                        "Jok belakang yang dapat dilipat\n" +
                        "Audio 2-DIN dengan layar sentuh, USB, dan Bluetooth\n" +
                        "Konsol tengah dengan tempat penyimpanan dan cup holder\n" +
                        "Spion elektrik\n" +
                        "Lampu baca depan dan belakang\n" +
                        "Lampu kabin\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan halogen atau LED (tergantung varian)\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 15\" atau 16\" (tergantung varian)\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Antena shark fin (tergantung varian)\n" +
                        "Power back door (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil3,
                namemobil =  "Ayla",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota Ayla:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 3.660 mm\n" +
                        "Lebar: 1.600 mm\n" +
                        "Tinggi: 1.520 mm\n" +
                        "Jarak sumbu roda: 2.450 mm\n" +
                        "Ground clearance: 180 mm\n" +
                        "Berat kosong: 740 - 760 kg\n" +
                        "Kapasitas tangki bahan bakar: 33 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 3 silinder, 12 katup, DOHC, Dual VVT-i\n" +
                        "Kapasitas mesin: 998 cc\n" +
                        "Tenaga maksimum: 68 PS/6.000 rpm\n" +
                        "Torsi maksimum: 91 Nm/4.400 rpm\n" +
                        "Sistem bahan bakar: EFI\n" +
                        "Sistem pendinginan: liquid cooled\n" +
                        "Transmisi: manual 5 percepatan atau otomatis 4 percepatan\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: McPherson strut dengan stabilizer\n" +
                        "Suspensi belakang: torsion beam\n" +
                        "Rem depan: cakram ventilasi\n" +
                        "Rem belakang: tromol\n" +
                        "Ukuran ban: 185/60 R15 atau 175/65 R14\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Dual SRS airbag\n" +
                        "ABS\n" +
                        "EBD\n" +
                        "Rem cakram depan\n" +
                        "Immobilizer\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC\n" +
                        "Power steering\n" +
                        "Power window\n" +
                        "Jok belakang yang dapat dilipat\n" +
                        "Head unit audio dengan layar sentuh, USB, dan Bluetooth\n" +
                        "Konsol tengah dengan tempat penyimpanan dan cup holder\n" +
                        "Spion elektrik\n" +
                        "Lampu baca depan dan belakang\n" +
                        "Lampu kabin\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan halogen\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 14\" atau 15\"\n" +
                        "Spoiler belakang\n" +
                        "Antena roof mounted\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil4,
                namemobil =  "Brio",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Honda Brio:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 3.610 mm\n" +
                        "Lebar: 1.680 mm\n" +
                        "Tinggi: 1.485 mm\n" +
                        "Jarak sumbu roda: 2.345 mm\n" +
                        "Ground clearance: 165 mm\n" +
                        "Berat kosong: 920 - 950 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 35 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, 16 katup, SOHC i-VTEC\n" +
                        "Kapasitas mesin: 1.197 cc\n" +
                        "Tenaga maksimum: 90 PS/6.000 rpm\n" +
                        "Torsi maksimum: 110 Nm/4.800 rpm\n" +
                        "Sistem bahan bakar: PGM-FI\n" +
                        "Sistem pendinginan: liquid cooled\n" +
                        "Transmisi: manual 5 percepatan atau otomatis CVT\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: McPherson strut\n" +
                        "Suspensi belakang: torsion beam\n" +
                        "Rem depan: cakram\n" +
                        "Rem belakang: tromol\n" +
                        "Ukuran ban: 175/65 R14 atau 185/55 R15 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Dual SRS airbag\n" +
                        "ABS\n" +
                        "EBD\n" +
                        "Rem cakram depan\n" +
                        "Immobilizer\n" +
                        "Security alarm\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC\n" +
                        "Power steering\n" +
                        "Power window\n" +
                        "Jok belakang yang dapat dilipat\n" +
                        "Audio system dengan layar sentuh, USB, dan Bluetooth\n" +
                        "Konsol tengah dengan tempat penyimpanan dan cup holder\n" +
                        "Spion elektrik\n" +
                        "Lampu baca depan dan belakang\n" +
                        "Lampu kabin\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan halogen dengan lampu senja LED\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 14\" atau 15\" (tergantung varian)\n" +
                        "Antena shark fin\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil5,
                namemobil =  "Civic",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Honda Civic:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.656 mm\n" +
                        "Lebar: 1.799 mm\n" +
                        "Tinggi: 1.416 mm\n" +
                        "Jarak sumbu roda: 2.700 mm\n" +
                        "Ground clearance: 133 mm\n" +
                        "Berat kosong: 1.277 - 1.357 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 47 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, 16 katup, SOHC i-VTEC\n" +
                        "Kapasitas mesin: 1.498 cc\n" +
                        "Tenaga maksimum: 173 PS/6.000 rpm\n" +
                        "Torsi maksimum: 220 Nm/1.700-5.500 rpm\n" +
                        "Sistem bahan bakar: PGM-FI\n" +
                        "Sistem pendinginan: liquid cooled\n" +
                        "Transmisi: manual 6 percepatan atau otomatis CVT\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson strut\n" +
                        "Suspensi belakang: multilink\n" +
                        "Rem depan: cakram ventilasi\n" +
                        "Rem belakang: cakram\n" +
                        "Ukuran ban: 215/55 R16 atau 235/40 R18 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "SRS airbag depan, samping, dan tirai\n" +
                        "Vehicle Stability Assist (VSA)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brakeforce Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Hill Start Assist (HSA)\n" +
                        "Emergency Stop Signal (ESS)\n" +
                        "Security alarm\n" +
                        "Immobilizer\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis\n" +
                        "Audio system dengan layar sentuh 7 inci, USB, dan Bluetooth\n" +
                        "Konsol tengah dengan tempat penyimpanan dan cup holder\n" +
                        "Jok kulit (tergantung varian)\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Power adjustable driver seat (tergantung varian)\n" +
                        "Keyless entry\n" +
                        "Sunroof (tergantung varian)\n" +
                        "Lampu kabin LED\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 16\" atau 18\" (tergantung varian)\n" +
                        "Antena shark fin\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Rear spoiler (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil.Berikut adalah spesifikasi lengkap dari mobil Honda Civic:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.656 mm\n" +
                        "Lebar: 1.799 mm\n" +
                        "Tinggi: 1.416 mm\n" +
                        "Jarak sumbu roda: 2.700 mm\n" +
                        "Ground clearance: 133 mm\n" +
                        "Berat kosong: 1.277 - 1.357 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 47 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, 16 katup, SOHC i-VTEC\n" +
                        "Kapasitas mesin: 1.498 cc\n" +
                        "Tenaga maksimum: 173 PS/6.000 rpm\n" +
                        "Torsi maksimum: 220 Nm/1.700-5.500 rpm\n" +
                        "Sistem bahan bakar: PGM-FI\n" +
                        "Sistem pendinginan: liquid cooled\n" +
                        "Transmisi: manual 6 percepatan atau otomatis CVT\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson strut\n" +
                        "Suspensi belakang: multilink\n" +
                        "Rem depan: cakram ventilasi\n" +
                        "Rem belakang: cakram\n" +
                        "Ukuran ban: 215/55 R16 atau 235/40 R18 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "SRS airbag depan, samping, dan tirai\n" +
                        "Vehicle Stability Assist (VSA)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brakeforce Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Hill Start Assist (HSA)\n" +
                        "Emergency Stop Signal (ESS)\n" +
                        "Security alarm\n" +
                        "Immobilizer\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis\n" +
                        "Audio system dengan layar sentuh 7 inci, USB, dan Bluetooth\n" +
                        "Konsol tengah dengan tempat penyimpanan dan cup holder\n" +
                        "Jok kulit (tergantung varian)\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Power adjustable driver seat (tergantung varian)\n" +
                        "Keyless entry\n" +
                        "Sunroof (tergantung varian)\n" +
                        "Lampu kabin LED\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 16\" atau 18\" (tergantung varian)\n" +
                        "Antena shark fin\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Rear spoiler (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil6,
                namemobil =  "Fortuner",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota Fortuner:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.795 mm\n" +
                        "Lebar: 1.855 mm\n" +
                        "Tinggi: 1.835 mm\n" +
                        "Jarak sumbu roda: 2.745 mm\n" +
                        "Ground clearance: 220 mm\n" +
                        "Berat kosong: 1.855 - 2.100 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 80 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder diesel, 16 katup, DOHC dengan VNT\n" +
                        "Kapasitas mesin: 2.393 cc (diesel)\n" +
                        "Tenaga maksimum: 149 PS/3.400 rpm (diesel)\n" +
                        "Torsi maksimum: 400 Nm/1.600-2.000 rpm (diesel)\n" +
                        "Sistem bahan bakar: Common-Rail Direct Injection (diesel)\n" +
                        "Sistem pendinginan: liquid cooled\n" +
                        "Transmisi: manual 6 percepatan atau otomatis 6 percepatan\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: double wishbone dengan coil spring\n" +
                        "Suspensi belakang: 4-link dengan coil spring\n" +
                        "Rem depan: ventilated disc\n" +
                        "Rem belakang: ventilated disc\n" +
                        "Ukuran ban: 265/60 R18 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping dan tirai (tergantung varian)\n" +
                        "Vehicle Stability Control (VSC)\n" +
                        "Traction Control (TRC)\n" +
                        "Hill-start Assist Control (HAC)\n" +
                        "Emergency Stop Signal (ESS)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Immobilizer\n" +
                        "Alarm\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis\n" +
                        "Audio system dengan layar sentuh, USB, dan Bluetooth\n" +
                        "Jok belakang dapat dilipat dan adjustable\n" +
                        "Jok kulit (tergantung varian)\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Power adjustable driver seat (tergantung varian)\n" +
                        "Keyless entry (tergantung varian)\n" +
                        "Sunroof (tergantung varian)\n" +
                        "Lampu kabin LED\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED dengan auto-leveling\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 18\" (tergantung varian)\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal (tergantung varian)\n" +
                        "Rear spoiler (tergantung varian)\n" +
                        "Roof rail (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil"
            ),
            mobil(
                R.drawable.mobil7,
                namemobil=  "HRV",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Honda HR-V:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.335 mm\n" +
                        "Lebar: 1.772 mm\n" +
                        "Tinggi: 1.605 mm\n" +
                        "Jarak sumbu roda: 2.610 mm\n" +
                        "Ground clearance: 180 mm\n" +
                        "Berat kosong: 1.295 - 1.395 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 40 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder DOHC i-VTEC\n" +
                        "Kapasitas mesin: 1.498 cc\n" +
                        "Tenaga maksimum: 130 PS/6.600 rpm\n" +
                        "Torsi maksimum: 155 Nm/4.600 rpm\n" +
                        "Sistem bahan bakar: Programmed Fuel Injection (PGM-FI)\n" +
                        "Transmisi: manual 6 percepatan atau otomatis CVT dengan paddle shift\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson Strut dengan Stabilizer\n" +
                        "Suspensi belakang: Torsion Beam dengan Stabilizer\n" +
                        "Rem depan: ventilated disc\n" +
                        "Rem belakang: solid disc\n" +
                        "Ukuran ban: 215/60 R17 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping (tergantung varian)\n" +
                        "Vehicle Stability Assist (VSA)\n" +
                        "Hill Start Assist (HSA)\n" +
                        "Emergency Stop Signal (ESS)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Isofix\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis\n" +
                        "Audio system dengan layar sentuh 7\" dan koneksi Bluetooth\n" +
                        "Jok belakang dapat dilipat dan adjustable\n" +
                        "Jok kulit (tergantung varian)\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Keyless entry (tergantung varian)\n" +
                        "Sunroof (tergantung varian)\n" +
                        "Lampu kabin LED\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 17\" (tergantung varian)\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal (tergantung varian)\n" +
                        "Shark fin antenna (tergantung varian)\n" +
                        "Rear spoiler (tergantung varian)\n" +
                        "Roof rail (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil"
            ),
            mobil(
                R.drawable.mobil8,
                namemobil =  "CHR",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota C-HR:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.360 mm\n" +
                        "Lebar: 1.795 mm\n" +
                        "Tinggi: 1.565 mm\n" +
                        "Jarak sumbu roda: 2.640 mm\n" +
                        "Ground clearance: 150 mm\n" +
                        "Berat kosong: 1.470 - 1.515 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 50 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder DOHC Dual VVT-i\n" +
                        "Kapasitas mesin: 1.798 cc\n" +
                        "Tenaga maksimum: 140 PS/6.400 rpm\n" +
                        "Torsi maksimum: 175 Nm/4.000 rpm\n" +
                        "Sistem bahan bakar: Programmed Fuel Injection (PGM-FI)\n" +
                        "Transmisi: otomatis CVT\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson Strut dengan Stabilizer\n" +
                        "Suspensi belakang: Double Wishbone dengan Stabilizer\n" +
                        "Rem depan: ventilated disc\n" +
                        "Rem belakang: solid disc\n" +
                        "Ukuran ban: 225/50 R18 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping dan kantung udara pelindung lutut pengemudi (tergantung varian)\n" +
                        "Vehicle Stability Control (VSC)\n" +
                        "Hill-start Assist Control (HAC)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Parking sensor (tergantung varian)\n" +
                        "Rear Cross Traffic Alert (tergantung varian)\n" +
                        "Blind Spot Monitor (tergantung varian)\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis dua zona\n" +
                        "Audio system dengan layar sentuh 8\" dan koneksi Bluetooth\n" +
                        "Jok belakang dapat dilipat dan adjustable\n" +
                        "Jok kulit (tergantung varian)\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Keyless entry dan push start/stop engine (tergantung varian)\n" +
                        "Speedometer digital dengan TFT display\n" +
                        "Wireless charging pad (tergantung varian)\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 18\" (tergantung varian)\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal (tergantung varian)\n" +
                        "Shark fin antenna\n" +
                        "Rear spoiler\n" +
                        "Roof rail (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil9,
                namemobil =  "Inova",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota Kijang Innova:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.735 mm\n" +
                        "Lebar: 1.830 mm\n" +
                        "Tinggi: 1.795 mm\n" +
                        "Jarak sumbu roda: 2.750 mm\n" +
                        "Ground clearance: 178 mm\n" +
                        "Berat kosong: 1.710 - 1.845 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 55 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, DOHC, Dual VVT-i\n" +
                        "Kapasitas mesin: 1.998 cc atau 2.694 cc (tergantung varian)\n" +
                        "Tenaga maksimum: 139 PS/5.600 rpm atau 171 PS/6.000 rpm (tergantung varian)\n" +
                        "Torsi maksimum: 183 Nm/4.000 rpm atau 360 Nm/1.200-3.400 rpm (tergantung varian)\n" +
                        "Sistem bahan bakar: Programmed Fuel Injection (PGM-FI)\n" +
                        "Transmisi: Manual 5-speed atau otomatis 6-speed\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: Double Wishbone dengan Stabilizer\n" +
                        "Suspensi belakang: 4-link dengan Stabilizer\n" +
                        "Rem depan: ventilated disc\n" +
                        "Rem belakang: drum atau solid disc (tergantung varian)\n" +
                        "Ukuran ban: 205/65 R16 atau 215/55 R17 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping (tergantung varian)\n" +
                        "Vehicle Stability Control (VSC) (tergantung varian)\n" +
                        "Hill-start Assist Control (HAC) (tergantung varian)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Parking sensor (tergantung varian)\n" +
                        "Rear Cross Traffic Alert (tergantung varian)\n" +
                        "Blind Spot Monitor (tergantung varian)\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis dengan kontrol di baris kedua (tergantung varian)\n" +
                        "Audio system dengan layar sentuh 8\" dan koneksi Bluetooth\n" +
                        "Jok belakang dapat dilipat dan adjustable\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Keyless entry dan push start/stop engine (tergantung varian)\n" +
                        "Speedometer analog atau digital (tergantung varian)\n" +
                        "Console box dengan armrest\n" +
                        "Head unit DVD player (tergantung varian)\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED (tergantung varian)\n" +
                        "Lampu belakang LED (tergantung varian)\n" +
                        "Velg alloy 16\" atau 17\" (tergantung varian)\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal (tergantung varian)\n" +
                        "Roof rail (tergantung varian)\n" +
                        "Spoiler belakang (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil10,
                namemobil =  "Jazz",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Honda Jazz:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 3.990 mm\n" +
                        "Lebar: 1.694 mm\n" +
                        "Tinggi: 1.524 mm\n" +
                        "Jarak sumbu roda: 2.530 mm\n" +
                        "Ground clearance: 135 mm\n" +
                        "Berat kosong: 1.036 - 1.133 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 40 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, SOHC i-VTEC\n" +
                        "Kapasitas mesin: 1.497 cc\n" +
                        "Tenaga maksimum: 120 PS/6.600 rpm\n" +
                        "Torsi maksimum: 145 Nm/4.600 rpm\n" +
                        "Sistem bahan bakar: Programmed Fuel Injection (PGM-FI)\n" +
                        "Transmisi: Manual 5-speed atau otomatis CVT\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson Strut dengan Stabilizer\n" +
                        "Suspensi belakang: H-Shape Torsion Beam dengan Stabilizer\n" +
                        "Rem depan: ventilated disc\n" +
                        "Rem belakang: drum atau solid disc (tergantung varian)\n" +
                        "Ukuran ban: 175/65 R15 atau 185/55 R16 (tergantung varian)\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping (tergantung varian)\n" +
                        "Vehicle Stability Assist (VSA) (tergantung varian)\n" +
                        "Hill-start Assist (HSA) (tergantung varian)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Emergency Stop Signal (ESS)\n" +
                        "Parking sensor (tergantung varian)\n" +
                        "Rearview camera (tergantung varian)\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC manual atau otomatis (tergantung varian)\n" +
                        "Audio system dengan layar sentuh 7\" dan koneksi Bluetooth\n" +
                        "Jok belakang dapat dilipat 60:40\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Keyless entry dan push start/stop engine (tergantung varian)\n" +
                        "Multi-information display\n" +
                        "Console box dengan armrest\n" +
                        "Head unit DVD player (tergantung varian)\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED (tergantung varian)\n" +
                        "Lampu belakang LED (tergantung varian)\n" +
                        "Velg alloy 15\" atau 16\" (tergantung varian)\n" +
                        "Fog lamp (tergantung varian)\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal (tergantung varian)\n" +
                        "Shark fin antenna (tergantung varian)\n" +
                        "Spoiler belakang (tergantung varian)\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil12,
                namemobil =  "Raize",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota Raize:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 3.995 mm\n" +
                        "Lebar: 1.695 mm\n" +
                        "Tinggi: 1.620 mm\n" +
                        "Jarak sumbu roda: 2.525 mm\n" +
                        "Ground clearance: 185 mm\n" +
                        "Berat kosong: 980 - 1.030 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 36 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 3 silinder, DOHC, turbocharged\n" +
                        "Kapasitas mesin: 1.0 liter\n" +
                        "Tenaga maksimum: 98 PS/6.000 rpm\n" +
                        "Torsi maksimum: 140 Nm/2.400-4.000 rpm\n" +
                        "Sistem bahan bakar: Direct Injection\n" +
                        "Transmisi: Manual 6-speed atau otomatis CVT\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson Strut dengan stabilizer\n" +
                        "Suspensi belakang: Torsion beam dengan stabilizer\n" +
                        "Rem depan: ventilated disc\n" +
                        "Rem belakang: drum\n" +
                        "Ukuran ban: 215/60 R17\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping dan curtain (tergantung varian)\n" +
                        "Vehicle Stability Control (VSC)\n" +
                        "Hill-start Assist Control (HAC)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Emergency Brake Signal\n" +
                        "Parking sensor (tergantung varian)\n" +
                        "Rearview camera (tergantung varian)\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis\n" +
                        "Audio system dengan layar sentuh 7\" dan koneksi Bluetooth\n" +
                        "Jok belakang dapat dilipat 60:40\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Keyless entry dan push start/stop engine (tergantung varian)\n" +
                        "Multi-information display\n" +
                        "Console box dengan armrest\n" +
                        "Head unit DVD player (tergantung varian)\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED dengan daytime running light (DRL)\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 17\"\n" +
                        "Fog lamp\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal\n" +
                        "Shark fin antenna\n" +
                        "Spoiler belakang\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil13,
                namemobil =  "Rush",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Toyota Rush:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.435 mm\n" +
                        "Lebar: 1.695 mm\n" +
                        "Tinggi: 1.705 mm\n" +
                        "Jarak sumbu roda: 2.685 mm\n" +
                        "Ground clearance: 220 mm\n" +
                        "Berat kosong: 1.245 - 1.325 kg (tergantung varian)\n" +
                        "Kapasitas tangki bahan bakar: 45 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, DOHC, Dual VVT-i\n" +
                        "Kapasitas mesin: 1.5 liter\n" +
                        "Tenaga maksimum: 104 PS/6.000 rpm\n" +
                        "Torsi maksimum: 136 Nm/4.200 rpm\n" +
                        "Sistem bahan bakar: Electronic Fuel Injection (EFI)\n" +
                        "Transmisi: Manual 5-speed atau otomatis 4-speed\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson Strut dengan stabilizer\n" +
                        "Suspensi belakang: 5-link dengan stabilizer\n" +
                        "Rem depan: ventilated disc\n" +
                        "Rem belakang: drum\n" +
                        "Ukuran ban: 215/60 R17\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping dan curtain (tergantung varian)\n" +
                        "Vehicle Stability Control (VSC)\n" +
                        "Hill-start Assist Control (HAC)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Emergency Brake Signal\n" +
                        "Parking sensor (tergantung varian)\n" +
                        "Rearview camera (tergantung varian)\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis\n" +
                        "Audio system dengan layar sentuh 7\" dan koneksi Bluetooth\n" +
                        "Jok belakang dapat dilipat 50:50\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Keyless entry dan push start/stop engine (tergantung varian)\n" +
                        "Multi-information display\n" +
                        "Console box dengan armrest\n" +
                        "Head unit DVD player (tergantung varian)\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED dengan projector dan DRL\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 17\"\n" +
                        "Fog lamp\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal\n" +
                        "Shark fin antenna\n" +
                        "Spoiler belakang\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil14,
                namemobil =  "Almaz",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Wuling Almaz:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.640 mm\n" +
                        "Lebar: 1.835 mm\n" +
                        "Tinggi: 1.760 mm\n" +
                        "Jarak sumbu roda: 2.750 mm\n" +
                        "Ground clearance: 200 mm\n" +
                        "Berat kosong: 1.745 kg\n" +
                        "Kapasitas tangki bahan bakar: 55 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, Turbocharged, 1.500 cc\n" +
                        "Kapasitas mesin: 1.500 cc\n" +
                        "Tenaga maksimum: 140 PS/5.600 rpm\n" +
                        "Torsi maksimum: 250 Nm/1.700-4.400 rpm\n" +
                        "Sistem bahan bakar: Direct Injection (DI)\n" +
                        "Transmisi: Manual 6-speed atau otomatis CVT\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: McPherson Strut\n" +
                        "Suspensi belakang: Multi-link\n" +
                        "Rem depan: Ventilated Disc\n" +
                        "Rem belakang: Disc\n" +
                        "Ukuran ban: 235/55 R18\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan\n" +
                        "SRS airbag samping dan curtain\n" +
                        "Electronic Stability Control (ESC)\n" +
                        "Hill Start Assist (HSA)\n" +
                        "Traction Control System (TCS)\n" +
                        "Anti-lock Braking System (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Rearview camera\n" +
                        "Sensor parkir belakang\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC otomatis dengan 3 zona\n" +
                        "Audio system dengan layar sentuh 8\" dan koneksi Bluetooth\n" +
                        "Jok belakang dapat dilipat 60:40\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors with turn signal\n" +
                        "Keyless entry dan push start/stop engine\n" +
                        "Multi-information display\n" +
                        "Console box dengan armrest\n" +
                        "Head unit DVD player\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan LED dengan projector dan DRL\n" +
                        "Lampu belakang LED\n" +
                        "Velg alloy 18\"\n" +
                        "Fog lamp\n" +
                        "Electrically adjustable and retractable side mirrors with turn signal\n" +
                        "Sunroof\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            ),
            mobil(
                R.drawable.mobil15,
                namemobil =  "Xenia",
                descmobil = "Berikut adalah spesifikasi lengkap dari mobil Daihatsu Xenia:\n" +
                        "\n" +
                        "Dimensi dan Berat:\n" +
                        "\n" +
                        "Panjang: 4.415 mm\n" +
                        "Lebar: 1.700 mm\n" +
                        "Tinggi: 1.655 mm\n" +
                        "Jarak sumbu roda: 2.650 mm\n" +
                        "Ground clearance: 180 mm\n" +
                        "Berat kosong: 1.070-1.120 kg\n" +
                        "Kapasitas tangki bahan bakar: 45 liter\n" +
                        "Mesin:\n" +
                        "\n" +
                        "Tipe mesin: 4 silinder, 1.300 cc atau 1.500 cc\n" +
                        "Kapasitas mesin: 1.300 cc atau 1.500 cc\n" +
                        "Tenaga maksimum: 95 PS/6.000 rpm atau 104 PS/6.000 rpm\n" +
                        "Torsi maksimum: 120 Nm/4.200 rpm atau 136 Nm/4.400 rpm\n" +
                        "Sistem bahan bakar: Electronic Fuel Injection (EFI)\n" +
                        "Transmisi: Manual 5-speed atau otomatis 4-speed\n" +
                        "Kaki-kaki:\n" +
                        "\n" +
                        "Suspensi depan: MacPherson Strut\n" +
                        "Suspensi belakang: Torsion Beam\n" +
                        "Rem depan: Ventilated Disc\n" +
                        "Rem belakang: Drum\n" +
                        "Ukuran ban: 185/65 R14 atau 185/60 R15\n" +
                        "Fitur Keamanan:\n" +
                        "\n" +
                        "Airbag depan untuk pengemudi dan penumpang depan (hanya tersedia pada varian tertentu)\n" +
                        "Sistem pengereman anti-lock braking system (ABS)\n" +
                        "Electronic Brake-force Distribution (EBD)\n" +
                        "Brake Assist (BA)\n" +
                        "Rear parking sensor\n" +
                        "Alarm system\n" +
                        "Immobilizer\n" +
                        "Fitur Interior:\n" +
                        "\n" +
                        "AC manual atau otomatis dengan 2 zona (hanya tersedia pada varian tertentu)\n" +
                        "Audio system dengan CD player, AM/FM radio, dan koneksi USB dan AUX\n" +
                        "Jok belakang dapat dilipat 50:50\n" +
                        "Power window\n" +
                        "Power door lock\n" +
                        "Power adjustable side mirrors\n" +
                        "Multi-information display\n" +
                        "Console box dengan armrest\n" +
                        "Head unit DVD player (hanya tersedia pada varian tertentu)\n" +
                        "Fitur Eksterior:\n" +
                        "\n" +
                        "Lampu depan halogen dengan reflektor\n" +
                        "Lampu belakang dengan LED\n" +
                        "Velg alloy 14\" atau 15\"\n" +
                        "Fog lamp (hanya tersedia pada varian tertentu)\n" +
                        "Electrically adjustable and retractable side mirrors\n" +
                        "Wiper depan dengan washer\n" +
                        "Catatan: Spesifikasi bisa berbeda tergantung pada varian atau tahun produksi mobil."
            )
        )
         val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MobilAdapter(this,mobilList){
            val intent = Intent (this, DetailmobilActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}