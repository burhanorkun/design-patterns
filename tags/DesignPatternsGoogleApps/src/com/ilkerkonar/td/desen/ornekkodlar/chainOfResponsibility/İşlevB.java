/**
 * @author İlker KONAR, Yazılım Kıdemli Uzmanı.
 *
 * Tasarım Desenleri Sitesi Kodları. Dikkat: Her hakkı saklıdır.
 */

package com.ilkerkonar.td.desen.ornekkodlar.chainOfResponsibility;

/**
 * İşlevA.java
 *
 * Tarih bilgisi : May 24, 2014
 */
public class İşlevB extends İşlev {

	@Override
	protected void işleviYerineGetir( final String işlemVerisi ) {
		System.out.println( "İşlev B yapıldı. Veri: " + işlemVerisi );
	}
}
