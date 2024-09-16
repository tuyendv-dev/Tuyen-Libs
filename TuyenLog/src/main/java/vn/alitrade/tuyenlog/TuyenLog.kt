package vn.alitrade.tuyenlog

import android.content.Context
import android.widget.Toast

public class TuyenLog {
   public fun showlog(context: Context, mes: String) {
        Toast.makeText(context, mes, Toast.LENGTH_LONG).show()
    }
}