package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recycleView : RecyclerView? = null
    var foodMenuText = arrayOf(
        "Audi TT 2.0 Turbo ปี 07",
        "BMW 520d รุ่นปี 2007",
        "BMW 520d (f10) ปี 11",
        " HONDA JAZZ 1.5 i-VTEC V (AS) ปี 2010",
        "Honda Civic 1.7 Vtec LEV ตัวท็อปสุด ปี 01",
        "HONDA CIVIC 1.5TURBO RS ปี2017",
        "Honda City 1.5 SV i-VTEC AT สีขาว ปี 2012",
        "Toyota VIOS 1.5 J ปี 2015 AT",
        "Nissan Navara MT 2.5 NP300 ปี16",
        "TOYOTA VELLFIRE 2.4V ปี 2010",
        "FORD FIESTA 1.4 S [AT] 2010",
        "Suzuki Swift 1.2 Glx ปี 16",
        "Benz SLK200 CGI R172 ปี 12",
        "ISUZU DMAX 1.9 S [MT] 2017")
    var foodMenuImage = arrayOf<Int>(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13,
        R.drawable.image14

    )
    var context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("ร้านรถมือสอง")
        recycleView = findViewById(R.id.menuRecycleview) as RecyclerView
        recycleView!!.layoutManager = LinearLayoutManager(context)
        recycleView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapterRecycleView(foodMenuText,foodMenuImage,context)
        recycleView!!.setAdapter(myAdapter)
    }
}
