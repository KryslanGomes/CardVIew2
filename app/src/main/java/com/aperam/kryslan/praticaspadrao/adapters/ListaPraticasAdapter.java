package com.aperam.kryslan.praticaspadrao.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aperam.kryslan.praticaspadrao.R;
import com.aperam.kryslan.praticaspadrao.domain.ListaPraticas;
import com.aperam.kryslan.praticaspadrao.interfaces.RecyclerViewOnClickListenerHack;
import com.turingtechnologies.materialscrollbar.INameableAdapter;

import java.util.List;

public class ListaPraticasAdapter extends RecyclerView.Adapter<ListaPraticasAdapter.MyViewHolder> implements INameableAdapter{
    private List<ListaPraticas> mList;
    private LayoutInflater mLayoutInflater;
    private RecyclerViewOnClickListenerHack mRecyclerViewOnClickListenerHack;

    private Context c;
    private String tipoLista;


    public ListaPraticasAdapter(Context c, List<ListaPraticas> lista){
        this.c = c;
        mList = lista;
        mLayoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public ListaPraticasAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {   //só é chamado na hora de criar uma nova view.
        View v = mLayoutInflater.inflate(R.layout.item_lista_praticas, viewGroup, false);

        return new ListaPraticasAdapter.MyViewHolder(v);
    }

    @Override
    public Character getCharacterForElement(int element) {
        Character c = mList.get(element).getTitulo().charAt(0);
        if(Character.isDigit(c)) {
            c = '#';
        }
        return c;
    }


    /*public void removeListItem(int position){  //APLICAR AOS FAVORITOS
        mList.remove(position);
        notifyItemRemoved(position);
    }*/

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{  //Responsável por controlar os cardViews, deletando os que não aparecem na tela para preservar memória
        private TextView titulo;
        public TextView subtitulo;


        private MyViewHolder(View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.tituloListaPraticas);
            subtitulo = itemView.findViewById(R.id.subtituloListaSimples);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(mRecyclerViewOnClickListenerHack != null){
                mRecyclerViewOnClickListenerHack.onClickListener(v, getLayoutPosition());
            }
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ListaPraticasAdapter.MyViewHolder myViewHolder, int positionList) {  //Vincula nossos dados com a view. (Seta o valor de cada 'mList' com uma view)

//        if(areaEmitente){
        myViewHolder.titulo.setText(mList.get(positionList).getTitulo());
        myViewHolder.subtitulo.setText(mList.get(positionList).getNumero());
    }

    @Override
    public int getItemCount() {  //Retorna a quantidade da lista.
        return mList.size();
    }

    public void setRecyclerViewOnClickListenerHack(RecyclerViewOnClickListenerHack r){
        mRecyclerViewOnClickListenerHack = r;  //Está adicionando o parâmetro de clique de entrada ao hack para ativar o click.
    }
}
