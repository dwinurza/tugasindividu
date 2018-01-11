/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dwinurzakiyah.latihanmvcjdbc.event;

import edu.dwinurzakiyah.latihanmvcjdbc.entity.Pelanggan;
import edu.dwinurzakiyah.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author TOSHIBA
 * NIM      : 10116500
 * NAMA     : Dwi Nurzakiyah
 * KELAS    : PBO11
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
