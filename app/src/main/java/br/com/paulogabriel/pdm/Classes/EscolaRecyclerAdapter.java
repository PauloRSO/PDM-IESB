package br.com.paulogabriel.pdm.Classes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.paulogabriel.pdm.R;


public class EscolaRecyclerAdapter extends RecyclerView.Adapter<EscolaRecyclerAdapter.EscolaRecyclerViewHolder> {

    public static ClickRecyclerView_Interface clickRecyclerViewInterface;
    Context mctx;
    private List<Escola> mList;

    public EscolaRecyclerAdapter(Context ctx, List<Escola> list, ClickRecyclerView_Interface clickRecyclerViewInterface) {
        this.mctx = ctx;
        this.mList = list;
        this.clickRecyclerViewInterface = clickRecyclerViewInterface;
    }

    @Override
    public EscolaRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_escolas, viewGroup, false);
        return new EscolaRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EscolaRecyclerViewHolder viewHolder, int position) {
        Escola escola = mList.get(position);

        viewHolder.escolaNome.setText(escola.getNome());
        viewHolder.escolaEmail.setText(escola.getEmail());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    protected class EscolaRecyclerViewHolder extends RecyclerView.ViewHolder{

        protected TextView escolaNome;
        protected TextView escolaEmail;

        public EscolaRecyclerViewHolder(final View itemView) {
            super(itemView);

            escolaNome = (TextView)itemView.findViewById(R.id.nome_da_escola);
            escolaEmail = (TextView)itemView.findViewById(R.id.email_da_escola);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewInterface.onCustomClick(mList.get(getLayoutPosition()));
                }
            });

        }
    }
}
