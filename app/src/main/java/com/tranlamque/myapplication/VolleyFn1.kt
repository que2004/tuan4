package com.tranlamque.myapplication

import android.content.Context
import android.widget.TextView
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyFn1 {
    var strJSON=""
    fun getALLData(context: Context, textview: TextView){
        val queue= Volley.newRequestQueue(context);
        val url="https://hungnttg.github.io/array_json_new.json";

        val request=JsonArrayRequest(url, { response ->
            for (i in 0 until response.length()) {
                try {
                    val person = response.getJSONObject(i);
                    val id = person.getString("id");
                    val name = person.getString("name")
                    val email = person.getString("email")
                    strJSON += "Id: $id\n";
                    strJSON += "Id: $name\n";
                    strJSON += "Id: $email\n";
                } catch (e: Exception) {
                    e.printStackTrace();
                }
            }
            textview.text=strJSON
        },{error -> textview.text=error.message})
        queue.add(request)
    }
}