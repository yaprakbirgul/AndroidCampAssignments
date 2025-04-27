package com.example.kotlin_dersleri.day2_nesne_tabanli_programlama

class Odev2 {

    // 1. Dereceyi Fahrenheit'a çevir (return)
    fun dereceToFahrenheit(derece: Double): Double {
        val sonuc = derece * 1.8 + 32
        return sonuc
    }

    // 2. Dikdörtgen çevresi (return)
    fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
        val cevre = 2 * (kisaKenar + uzunKenar)
        return cevre
    }

    // 3. Faktöriyel hesaplama (return)
    fun faktoriyel(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    // 4. Kelimede kaç tane 'a' var (return)
    fun aHarfSayisi(kelime: String): Int {
        val sayi = kelime.count { it == 'a' || it == 'A' }
        return sayi
    }

    // 5. Kenar sayısına göre iç açı toplamı (return)
    fun icAciToplami(kenarSayisi: Int): Int {
        val toplam = (kenarSayisi - 2) * 180
        return toplam
    }

    // 6. Maaş hesaplama (return)
    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        val maas = if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            (160 * 10) + ((toplamSaat - 160) * 20)
        }
        return maas
    }

    // 7. Kota aşım ücreti hesaplama (return)
    fun kotaUcreti(kullanilanGB: Int): Int {
        val ucret = if (kullanilanGB <= 50) {
            100
        } else {
            100 + (kullanilanGB - 50) * 4
        }
        return ucret
    }
}
