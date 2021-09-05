package com.example.mykotlincontectdata

import android.content.ContentResolver
import android.database.Cursor
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bett.com.kotlinlistview.dtos.UserDto
import com.example.mykotlincontectdata.adadpter.UsersAdapter


class ReadContectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.read_contect)

        var recyclerView: RecyclerView? = null
        recyclerView = findViewById(R.id.recyclerView)


        var adapter = UsersAdapter(generateData())
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.itemAnimator = DefaultItemAnimator()

        recyclerView?.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    fun generateData(): ArrayList<UserDto> {
        var result = ArrayList<UserDto>()


        /* for (i in 0..9) {
               var user: UserDto = UserDto("pooja", "patell ;)")
               result.add(user)
           }*/
        val cr = contentResolver
        val contacts: Cursor? =
            cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null)
        if (contacts!!.count > 0)
            while (contacts.moveToNext()) {
                //   val name=contacts.getString(contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))
                val Cname = contacts.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)
                val Cnumber = contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)
                val name = contacts.getString(Cname)
                val number = contacts.getString(Cnumber)


                val obj = UserDto()
                obj.name = name
                obj.Number = number
                result.add(obj)
            }



        contacts.close()

        return result
    }


}

