package my.edu.tarc.myrecycleviewritg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.myrecycleviewritg2.data.Product
import my.edu.tarc.myrecycleviewritg2.data.ProductAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("apple",2.00,R.drawable.ic_baseline_ac_unit_24),
            Product("orange",5.00,R.drawable.ic_baseline_ac_unit_24),
            Product("JUN JIE",2.00,R.drawable.ic_baseline_ac_unit_24),
            Product("JIE LONG",5.00,R.drawable.ic_baseline_ac_unit_24),
            Product("CX",2.00,R.drawable.ic_baseline_ac_unit_24),
            Product("WEAKTOR",5.00,R.drawable.ic_baseline_ac_unit_24),
            Product("SHAYNELOU",2.00,R.drawable.ic_baseline_ac_unit_24),
        )

        val myRecyclerView : RecyclerView = findViewById(R.id.productRecycleView)
        myRecyclerView.adapter = ProductAdapter(productList)
        myRecyclerView.setHasFixedSize(true)
    }
}