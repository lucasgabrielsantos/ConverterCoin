package br.com.android.challengeandroid.list.view.recyclerview

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.android.challengeandroid.R
import br.com.android.challengeandroid.model.CoinList

class ItemCoinViewHolder(itemView: View, private val itemCoinClickListener: ItemCoinClickListener) :
    RecyclerView.ViewHolder(itemView) {
    private var tvName: TextView = itemView.findViewById(R.id.tv_name)
    private val btnToConvert: Button = itemView.findViewById(R.id.btn_to_convert)

    fun bind(coinList: CoinList) {
        tvName.text = coinList.name
        btnToConvert.setOnClickListener {
            itemCoinClickListener.let {
                itemCoinClickListener.clickItem(coinList.code)
            }
        }
    }
}