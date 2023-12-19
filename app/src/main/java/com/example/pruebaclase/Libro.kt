package com.example.pruebaclase

import android.os.Parcel
import android.os.Parcelable

class Libro (private var titulo : String?, private var numPag : Int, private var nomAutor : String?, private var año : Int):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    fun getTitulo(): String? {
        return titulo
    }
    fun getnumPag(): Int {
        return numPag
    }
    fun getNomAutor(): String? {
        return nomAutor
    }
    fun getAño(): Int {
        return año
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(titulo)
        parcel.writeInt(numPag)
        parcel.writeString(nomAutor)
        parcel.writeInt(año)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Libro> {
        override fun createFromParcel(parcel: Parcel): Libro {
            return Libro(parcel)
        }

        override fun newArray(size: Int): Array<Libro?> {
            return arrayOfNulls(size)
        }
    }
}