package com.aperam.kryslan.praticaspadrao;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;

import com.aperam.kryslan.praticaspadrao.BancoDeDados.BD;
import com.aperam.kryslan.praticaspadrao.adapters.ViewPagerAdapter;
import com.aperam.kryslan.praticaspadrao.domain.ListaPraticas;
import com.aperam.kryslan.praticaspadrao.tools.DrawerCreator;
import com.aperam.kryslan.praticaspadrao.tools.Utils;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.interfaces.OnCheckedChangeListener;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context c = this;
    public ViewPager viewPager;

    private List<ListaPraticas> listPraticas;
    private TabLayout tabLayout;
    private int mItemDrawerSelected;
    private int mProfileDrawerSelected;

    private OnCheckedChangeListener mOnCheckedChangeListener = new OnCheckedChangeListener(){  //Listener do "Lista resumida" no drawer.
        @Override
        public void onCheckedChanged(IDrawerItem drawerItem, CompoundButton buttonView, boolean isChecked) {}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //CRIANDO ANIMAÇÃO.
        /*Explode transition1 = new Explode();
        transition1.setDuration(600);

        Fade transition2 = new Fade();
        transition2.setDuration(600);

        getWindow().setExitTransition(transition1);  //transição na ida.
        getWindow().setReenterTransition(transition2);  //transição na volta.*/

        TransitionInflater inflater = TransitionInflater.from(this);  //Recebe a animação quando está em outr activity e volta para esta.
        Transition transition = inflater.inflateTransition(R.transition.transitions);

        getWindow().setSharedElementExitTransition(transition);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INICIA O SERVIÇO QUE AVISA QUANDO FAZ ALGUM SCREENSHOT.
        new Utils().ScreenshotListener(c);  //Funciona em todas as activitys pois continuar rodando.

        /*if(savedInstanceState != null){
            mItemDrawerSelected = savedInstanceState.getInt("mItemDrawerSelected", 0);

        }else{
            listPraticas = getSetPraticasList(50);
        }*/

        Toolbar mToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);  //Cria a Toolbar.

        //TABs
        viewPager = findViewById(R.id.pager);
        TabLayout tabLayout = findViewById(R.id.tab);

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), BD.GetTabsBd(c)));  //Criando as Tabs com seus nomes baseado no BdLite.
        tabLayout.setupWithViewPager(viewPager);  //Vinculando o viewPager com o tabLayout.

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setHorizontalFadingEdgeEnabled(true);  //Aplica efeito de aparição e desaparição suave no rolamento do tabLayout na parte da esquerda.
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {}
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        //HEADER
        DrawerCreator drawerClass = new DrawerCreator();
        AccountHeader headerDrawer = drawerClass.DraweHeaderBuilder(this, savedInstanceState);

        //NAVIGATIONDRAWER
        drawerClass.DrawerBodyBuilder(this, savedInstanceState, mToolbar, viewPager, c, headerDrawer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);  //Inserindo as opções na toolbar.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);  //Quando clicar nos itens do menu.
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(resultCode==2) {  //Só será dois, se for fechado pelas activitys Frag, passando o comando de voltar passando informações: startActivityForResult.
            int i = data.getIntExtra("tabSelecionada", 2);  //Retorna o valor do intent como 2, e a tab selecionada.
            if (i < 10) {  //Para não dar erro, pois se selecionar configurações no drawer por exemplo, ele vai dar erro pois não existe essa tab.
                viewPager.setCurrentItem(i - 1);
            }else{  //Se for maior do que o número de tabs existentes, ele retorna para a tab um, mas IMPLEMENTAR FUTURAMENTE.
                viewPager.setCurrentItem(0);
            }
        }
    }

    /*@Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("mItemDrawerSelected", mItemDrawerSelected);
        outState.putInt("mProfileDrawerSelected", mProfileDrawerSelected);
        outState.putParcelableArrayList("listCars", (ArrayList<Car>) listCars);
        outState = navigationDrawerLeft.saveInstanceState(outState);
        outState = headerNavigationLeft.saveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }*/
}
