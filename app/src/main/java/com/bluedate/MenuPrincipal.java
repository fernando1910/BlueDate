package com.bluedate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.SwitchDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MenuPrincipal extends AppCompatActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);



        /*

        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withCompactStyle(false)
                .withSavedInstance(savedInstanceState)
                .withThreeSmallProfileImages(false)
                .withHeaderBackground(R.drawable.batman)

                .addProfiles(
                        new ProfileDrawerItem().withName(objUsuario.getNome()).withIcon(roundImage)
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile iProfile, boolean b) {
                        startActivity(new Intent(MenuPrincipalNovo.this, VisualizarPerfil.class));
                        return false;
                    }
                })
                .build();

        Drawer result = new DrawerBuilder(this)
                .withActivity(this)
                .withToolbar(mToolbar)
                .withActionBarDrawerToggleAnimated(true)
                .withDrawerGravity(Gravity.LEFT)
                .withSavedInstance(savedInstanceState)
                .withSelectedItem(0)
                .withAccountHeader(headerResult)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Inicial").withIcon(R.drawable.home),
                        new PrimaryDrawerItem().withName("Eventos").withIcon(R.drawable.star),
                        new PrimaryDrawerItem().withName("Calendario").withIcon(R.drawable.calendar_today),
                        new PrimaryDrawerItem().withName("Pesquisar").withIcon(R.drawable.magnify),
                        new SectionDrawerItem().withName("Configurações"),
                        new SwitchDrawerItem().withName("Notificação").withChecked(fg_notificacoes).withOnCheckedChangeListener(mOnCheckedChangeListener).withIcon(R.drawable.bell),
                        new PrimaryDrawerItem().withName("Mais opções").withIcon(R.drawable.settings)
                )

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        try {
                            Fragment mFragment = null;
                            switch (position) {
                                case 1:
                                    mFragment = Painel.newInstance();
                                    setTitleActionBar("Início");
                                    break;
                                case 2:
                                    mFragment = new PainelTodosEventos();
                                    setTitleActionBar("Convites");
                                    break;
                                case 3:
                                    CaldroidFragment mFragmentCalendar = new CaldroidFragment();

                                    final CaldroidListener mCaldroidListener = new CaldroidListener() {
                                        @Override
                                        public void onSelectDate(Date date, View view) {
                                            Intent intent = new Intent(MenuPrincipalNovo.this, PainelEventosPadrao.class);
                                            intent.putExtra("dt_evento", date.toString());
                                            startActivity(intent);
                                        }
                                    };
                                    mFragmentCalendar.setCaldroidListener(mCaldroidListener);
                                    mFragment = mFragmentCalendar;
                                    setTitleActionBar("Calendário");
                                    break;
                                case 4:
                                    startActivity(new Intent(MenuPrincipalNovo.this, PesquisarEvento.class));
                                    break;
                                case 7:
                                    startActivity(new Intent(MenuPrincipalNovo.this, PainelConfiguracao.class));
                                    break;
                            }

                            if (mFragment != null) {
                                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                                ft.isEmpty();
                                ft.replace(R.id.layoutConteudo, mFragment, "tagMain");
                                ft.commit();
                            }

                        } catch (Exception e) {
                            Toast.makeText(MenuPrincipalNovo.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                        return false;
                    }

                })

                .build();
                */
    }

    public void teste(View view) {
        startActivity(new Intent(MenuPrincipal.this, PesquisarEvento.class));
    }

}
