package com.example.kotlin_dersleri.day2_nesne_tabanli_programlama

fun main() {
    val odev = Odev2()

    // 1. Dereceyi Fahrenheit'a çevir
    val sonuc1 = odev.dereceToFahrenheit(25.0)
    println("Fahrenheit: $sonuc1")

    // 2. Dikdörtgen çevresi
    val sonuc2 = odev.dikdortgenCevresi(5, 10)
    println("Dikdortgen cevresi: $sonuc2")

    // 3. Faktöriyel hesaplama
    val sonuc3 = odev.faktoriyel(5)
    println("Faktoriyel: $sonuc3")

    // 4. 'a' harfi sayısı
    val sonuc4 = odev.aHarfSayisi("Ankara")
    println("a harfi sayisi: $sonuc4")

    // 5. İç açı toplamı
    val sonuc5 = odev.icAciToplami(5)
    println("ic aci toplami: $sonuc5")

    // 6. Maaş hesaplama
    val sonuc6 = odev.maasHesapla(22)
    println("Maas: $sonuc6 ₺")

    // 7. Kota aşım ücreti
    val sonuc7 = odev.kotaUcreti(60)
    println("Kota ucreti: $sonuc7 ₺")
}
