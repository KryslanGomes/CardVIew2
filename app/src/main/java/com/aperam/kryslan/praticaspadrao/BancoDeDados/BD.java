package com.aperam.kryslan.praticaspadrao.BancoDeDados;

import android.content.Context;

import com.aperam.kryslan.praticaspadrao.R;

public class BD {
    //Menus (sumários)
    public static String[] GetTabsBd(Context c){
        return new String[]{
                c.getResources().getString(R.string.areaEminente),
                c.getResources().getString(R.string.areasRelacionadas),
                c.getResources().getString(R.string.autor),
                c.getResources().getString(R.string.dataDeVigencia),
                c.getResources().getString(R.string.nivel),
                c.getResources().getString(R.string.processo),
                c.getResources().getString(R.string.restrito),
                c.getResources().getString(R.string.favoritos)};
    }

    public static String[] GetAutorBd(){
        return new String[]{"ABNER LUCIO F DUTRA" +
                "Adão Cordeiro de Azevedo" +
                "ADILSON A GONCALVES" +
                "ADIR SOARES DE M JUNIOR" +
                "ADJACIR DE SOUSA" +
                "Administrador Docnix" +
                "ADRIANO HENRIQUE SILVA" +
                "Adriano Oliveira Vago" +
                "AGNALDO PAULO DA SILVA" +
                "Agnaldo Pinto Fiuza" +
                "AGNALDO SILVA CARVALHO" +
                "Ailton Costa de Azevedo" +
                "AILTON RODRIGUES DO PRADO" +
                "ALCY DIAS RODRIGUES" +
                "ALESCIANO G SILVA PEREIRA" +
                "ALEXANDRE VELOSO VIEIRA" +
                "ALINE SOARES N ALVARENGA" +
                "Altieres Fernando Gomes Carneiro" +
                "AMARILDO FERREIRA DOS SANTOS#181940" +
                "ANDERSON JONNE SANT ANA" +
                "Andre Luiz Pires de Figueiredo" +
                "Angelica Fabiana Batista P de" +
                "Angelo Antonio Gonçalves Coelho" +
                "ANGELO FERREIRA COSTA" +
                "ANGELO ROSA DA SILVA" +
                "ANTONIO CARLOS DE ASSIS" +
                "ANTONY WILLIAM DE ALMEIDA" +
                "ARISIO DE ABREU BARBOSA" +
                "ARLEN CARNEIRO DE ARAUJO" +
                "BRUNO CORDEIRO COSTA" +
                "BRUNO DE ALMEIDA MIRANDA" +
                "CAIO DE PAULA CAMARGO PISANO" +
                "CARINE DE OLIVEIRA MAIA" +
                "CARLOS A A DE OLIVEIRA" +
                "CARLOS ALBERTO MOURAO" +
                "CARLOS HENRIQUE DE CASTRO" +
                "Carlos Oliveira Costa" +
                "CELIA MARIA S RODRIGUES" +
                "CHARLES SILVA MAGALHAES" +
                "CHARLSTON N RIBEIRO" +
                "CLAUDIANO Z FONTOURA" +
                "Claudilene Aparecida Alves Pena" +
                "CLAUDIMAR P DOS SANTOS" +
                "CLAUDIO M DE ALCANTARA" +
                "Claudio Roberto de Paula" +
                "CLAUDIO SILVA MIRANDA" +
                "CLAUDIO TEIXEIRA GOMES" +
                "Cleberson Marcelo dos Santos" +
                "CLEIDE C DA S FAUSTINI" +
                "CLEONICE M ALVES FREITAS" +
                "CLINGER FELIX SANTIAGO" +
                "CRISTIAN C DE FREITAS" +
                "CRISTINA BORGES P M ALTO" +
                "CYNTIA RENATA VALERIANO DE OLIVEIRA" +
                "DALTON HERINGER DE SOUZA" +
                "Darleny Fernandes Vieira" +
                "DENISE A BARCELOS ASSIS" +
                "DILSON P DE MELO" +
                "DIOGO FERREIRA DE CASTRO" +
                "DIONATAN M A MARINHO" +
                "DOUGLAS FERREIRA DE SOUSA" +
                "EDILSON MARCIO NOGUEIRA" +
                "EDILSON S CAVALIERI" +
                "EDMAR G PATROCINIO" +
                "EDNA LEITE SILVA" +
                "EDNEI ARAUJO CLARA" +
                "EDSON AMORIM" +
                "EDSON JOSE ALVES" +
                "EDSON MOURA OLIVEIRA" +
                "EDUARDO LUIZ G TEIXEIRA" +
                "EDUARDO MILAGRES DA SILVA" +
                "EDVAL SOARES DE SOUZA" +
                "ELIAS CARLOS LOPES" +
                "ELISA DAS GRACAS S LEVI" +
                "Elvio Goncalves do Nascimento" +
                "ELYSE PENHA P S E SILVA" +
                "EMILIANA C M ARTHUSO" +
                "ENILBER LUCAS SILVA" +
                "ERICH FABIANY SANTOS" +
                "ERLI APARECIDO DE PAULA JUNIOR" +
                "ERMELINO VIEIRA COURA" +
                "EURONIDES V P FILHO" +
                "Ezio Vinicius Santos" +
                "FABIANO SOUSA ARAUJO¹" +
                "FABIO DE ASSIS VALENTE" +
                "Fabio Gomes Pacheco" +
                "FABIO GOMES PACHECO#365458" +
                "FABRICIO L DE ALCANTARA" +
                "Fausto Figueiredo Gomes" +
                "FELIPE GRATIVOL LIMA" +
                "FELLIPE H BRITO CARVALHO" +
                "FERNANDA DE SA OLIVEIRA LIZARDO¹" +
                "FERNANDO ALVES ALVARENGA" +
                "FILEMON SILVA MENDES" +
                "FILIPE SOARES PONTES" +
                "FLAMARION ANICIO BATISTA" +
                "Flavia Adalgisa Magalhaes Santos" +
                "FLAVIO ANTONIO RIBEIRO" +
                "FLAVIO APARECIDO LIMA DE ANDRADE" +
                "FLAVIO BARCELOS MORAIS" +
                "FLAVIO DA SILVA" +
                "FRANCISCO DUARTE FERREIRA" +
                "FRANCISCO GONCALVES LIMA" +
                "GABRIEL RODRIGUES LUZIA" +
                "GAVYLAM SILVA DE ALMEIDA" +
                "Geirson Neves Gandra" +
                "GEOVANY SANTIAGO SOARES" +
                "Geraldo aparecido leandro" +
                "GERALDO APARECIDO S SOUSA" +
                "GERALDO DE ASSIS SILVA" +
                "GERALDO M DA SILVEIRA" +
                "GERALDO MARCOS DE SOUZA" +
                "GIL NEY CHAVES ULHOA" +
                "GILBERTH B DE O ALVES" +
                "GILBERTO DE ALMEIDA" +
                "GILCESAR G S N DE AVILA" +
                "GILSON JUSTO REIS" +
                "GLAUBER F BATISTA" +
                "GLAUTIERE PAIVA GOMES" +
                "GUILHERME F BARBOSA COURA" +
                "HELITON MARTINS REIS" +
                "HELTON ALMEIDA NEVES" +
                "HERMAN SAVIO DE SOUZA" +
                "HUGLESLEI V M SILVA" +
                "HUMBERTO DE O ARAUJO" +
                "HUMBERTO SOUSA BARCELOS" +
                "IRIMAR NOVAES SILVA#360940" +
                "IVANILSON BISPO DE ALMEIDA" +
                "IVONILSON F DE ALMEIDA" +
                "JANE DE L FERRAZ BARRILAO" +
                "JANEIR RIBEIRO DUTRA" +
                "JEAN ALVES DE SOUZA" +
                "JEANDERSON E MUNIZ SILVA" +
                "JENNER COSTA FERREIRA" +
                "Jessica Aparecida Cordeiro" +
                "JOAO BOSCO F PACIFICO" +
                "JOAO GERALDO ALVES" +
                "JOAO KENEDE MAGALHAES" +
                "Joao Paulo Gomes Moreira" +
                "JOAQUIM GOMES DE SOUZA" +
                "JOSE BENIGNO DE ASSIS" +
                "JOSE CARLOS MARTINS SILVA" +
                "JOSE CARLOS ROSA DA SILVA" +
                "JOSE GERALDO DE C AMERICO" +
                "JOSE GERALDO DOS SANTOS" +
                "Jose Luiz de Matos" +
                "JOSE R DE OLIVEIRA" +
                "JOSE RENATO SILVA NUNES" +
                "JOSE RIBEIRO DE A FILHO" +
                "JOSE ROBERTO DA CRUZ" +
                "JOSE ROBERTO SIMAO" +
                "JOSE ROMARIO DE F MOTA" +
                "Josimar Mendes Araujo" +
                "JOYCE FRANCELE ROCHA GOMES" +
                "JULIO CESAR C CALDEIRA" +
                "JUSAEL DE ALMEIDA" +
                "KEYFERSON G FERREIRA" +
                "KLEBER M DE OLIVEIRA" +
                "Kleolvane Carlos Figueiredo de Paula" +
                "Leila Miriam Oliveira" +
                "LEONARDO A FERNANDES" +
                "LEONARDO DE A HORACIO" +
                "LEONARDO DE A RIBEIRO" +
                "LINCOLN DOS S RODRIGUES" +
                "LUCELIO MIRANDA" +
                "LUCIANA NASCIMENTO OLIVEIRA FAVARATO" +
                "Luciano Fernandes Viana" +
                "LUCIANO M DA SILVA" +
                "Lucimar Aparecida dos Reis Gomes#20160801" +
                "Lucio Asai Bailo" +
                "LUIS CARLOS ASSUNCAO" +
                "LUIS CLAUDIO B TORRES" +
                "LUIZ ANDRE DE OLIVEIRA¹" +
                "LUIZ CLAUDIO ANDRE PINTO" +
                "MAGDA REGINA S PLAIS" +
                "MAGNO GOMES FRADE" +
                "MARCELO FERREIRA COSTA" +
                "MARCELO LOPES M BORGES" +
                "MARCELO SEIXAS VIEIRA" +
                "MARCELO SOUZA PEREIRA" +
                "MARCIA A MIRANDA DE ASSIS" +
                "MARCIO A G FERNANDES" +
                "MARCIO FERREIRA RODRIGUES" +
                "MARCO AURELIO DE A NEIVA" +
                "MARCO SERGIO C DO ROSARIO" +
                "MARCOS AURELIO S PEDROSA" +
                "MARCUS HAROLDO R FERREIRA" +
                "MARCUS MICHEL ELIAS" +
                "MARDLIRIO JOSE MARTINS" +
                "MARIA DE J DE P FREITAS" +
                "Maria do Socorro de Souza Lima" +
                "MARIA REGINA B MENDES" +
                "MARIO SERGIO MOURAO" +
                "MARLI GERONIMA" +
                "MARLON BUENO FELIX" +
                "MAURICIO CESAR PEREIRA RODRIGUES" +
                "Michele Cristina Marques Rosa" +
                "MICHELLA F BEZERRA BARONY" +
                "Milane Mendes de Macedo" +
                "MILTON ASSIS DA SILVA" +
                "Milton Pereira dos Santos Junior" +
                "MOISES J L DA SILVA" +
                "NAGYLA FRIGULHA DE M LIMA" +
                "NELSON LUCAS ALVES JUNIOR" +
                "NEY SOUSA MOREIRA" +
                "NILDOMAR SOARES FERREIRA" +
                "NILTON CESAR LOURENCO" +
                "NIVALDO FERREIRA SILVA" +
                "Nivaldo Santos da Silva" +
                "Nucleo Acabamento de Laminados a Quente" +
                "Nucleo Acabamento e Servicos em Inox" +
                "Nucleo Centro de Pesquisa" +
                "Nucleo da Engenharia de Manutencao" +
                "Nucleo Gestao Ambiental" +
                "Nucleo Gestao Estrategica" +
                "Nucleo Laminacao de Inox" +
                "Nucleo Laminacao de Siliciosos" +
                "Nucleo Laminacao Tiras a Quente" +
                "Nucleo Metrologia" +
                "Nucleo Posto Medico" +
                "Nucleo Reducao" +
                "Nucleo Transporte Externo" +
                "Nucleo Utilidades" +
                "ORISRAK ALVES DORNELAS" +
                "Osvaldo Pires Ferreira" +
                "OTAVIO A DA C TEIXEIRA" +
                "PATRICIA ZELIA DE ASSIS" +
                "PATRICK QUINTAO VIEIRA" +
                "Paulino Cordeiro de Oliveira" +
                "PAULO CESAR GONCALVES" +
                "PAULO H DOS SANTOS" +
                "PAULO HENRIQUE DE OLIVEIRA MAIA#197370" +
                "PAULO JOSE DE SOUZA" +
                "PAULO JUNIO DE S BARBOSA" +
                "PAULO RICARDO MUSSI OLIVEIRA" +
                "PEDRO GONCALVES DOS REIS" +
                "PEDRO HENRIQUE B SOUZA" +
                "Polibio Martins Nogueira" +
                "RAFAEL LOPES F PENEDO" +
                "Rafaella Pereira" +
                "Raquel Alves Correia" +
                "RAQUEL MENDONCA DE FARIA" +
                "RAVENY CRISTINY ASSIS FRANCISQUINI" +
                "RAYLANDER ROCHA PESSOA" +
                "Regilsllainy Cobucci Pena" +
                "REGINA CELIA DE MELO" +
                "REINALDO DE OLIVEIRA CRUZ" +
                "REINALDO O G JUNIOR" +
                "REINALDO SANTOS SILVA" +
                "REINALDO SILVANO SANTOS#235641" +
                "RENATO A DE A SANTANA" +
                "Ricardo Antonio Ferreira de Oliveira" +
                "RICARDO JOSE G COSTA" +
                "RICHARD ANDRE PERDIGAO" +
                "RIVA ULTIMO DE C MOREIRA" +
                "ROBERTA SILVA NUNES" +
                "ROBERTO JUNIOR G LEITE" +
                "ROBERTO ROSA LUPPI" +
                "ROBSON DE SOUZA BARCELOS" +
                "ROBSON GUIMARAES LOPES" +
                "ROBSON MARTINS" +
                "ROBSON WANDER SILVA SOUZA" +
                "Rodolfo Manoel Lemes da Costa" +
                "RODRIGO BARONY BRUZI" +
                "ROGERIO RUIZ SANCHEZ" +
                "Romario Emiliano Barbosa Olimpo" +
                "ROMILSON FREITAS SOUZA" +
                "RONALDO C DE OLIVEIRA" +
                "Ronielly Lemos.#20160827" +
                "RONILDO RODRIGUES SOUSA" +
                "RONILDSON G MONTEIRO" +
                "RONNE FERREIRA PIRES" +
                "RUBENS DA SILVA MOURA" +
                "RUBENS GOMES PESSOA" +
                "SANDEY NOVY ARAUJO ROCHA" +
                "SANDRO M SOUSA FELIX" +
                "SANNCLEY AUGUSTO RUFINO" +
                "SERGIO BRUM LUGAO" +
                "SERGIO MIRANDA DA SILVA" +
                "Sergio Ricardo Martins" +
                "Sergio Silveira de Vasconcellos Aprigio Junior" +
                "SHEYLLA LIMA SOUZA" +
                "SHIRLLENY F DE LIMA SOUZA" +
                "SIDLEY RAMOS BARCELOS" +
                "Silas Roberto Machado Vilela" +
                "SILVERIO SANTANA FONTES" +
                "SILVIMAR GONCALVES CAMPOS" +
                "SOLANGE VALENTIM PEREIRA" +
                "STELO ALEIXO DE C FILHO" +
                "TALES WALLACE SOUZA" +
                "TANIA M A DOS S G PESSOA" +
                "TEOFILO M DE S SANTOS" +
                "THAIS APARECIDA CASTRO DA SILVA" +
                "THIAGO V DE O BARBOSA" +
                "TIAGO BATISTA DOS SANTOS" +
                "TIAGO M DE O EGIDIO" +
                "Tony Terra Beraldo" +
                "VAGNER M DE CARVALHO" +
                "VALQUIRIA CARVALHO ARDUINI" +
                "Vanessa Marques da Silva" +
                "VERA LUCIA GASQUEL COELHO#386772" +
                "VICENTE SANTALUCIA" +
                "VICTOR M C DE OLIVEIRA" +
                "VINICIUS M DE CARVALHO" +
                "VIVALDO GERALDO DINIZ" +
                "WALDER BENVINDO OLIVEIRA CARVALHO" +
                "Waldmir de Assis Castro" +
                "WALTON FERNANDES DA SILVA" +
                "WANDERLEY V DE FARIA" +
                "WANDERNY MENDES RIBEIRO" +
                "WANDERSON SILVA MARQUES" +
                "WELINGTON MADUREIRA SILVA" +
                "Wellisson Ferreira" +
                "WESLEY DE CARVALHO SILVA" +
                "WILD GONCALVES DE SOUZA" +
                "WILLIAM CLAYTON A ALMEIDA" +
                "WILSON PEREIRA"};
    }

    public static String[] GetProcessoBd(){
        return new String[]{" Acabamento Superficial" +
                "Aceiros" +
                "Ações Corretivas e Preventivas" +
                "Administração de Pessoal" +
                "Adquirir Produtos e Serviços" +
                "AF1-Carregamento" +
                "AF1-Check-list" +
                "AF1-Cowpers" +
                "AF1-Lingotamento de Gusa" +
                "AF1-Processo" +
                "AF1-Risco Operacional" +
                "AF1-Soprador" +
                "AF1-Transporte Carro Torpedo" +
                "AF1-Tratamento de Gás" +
                "AF1-Vazamento" +
                "AF2-Carregamento" +
                "AF2-Check-list" +
                "AF2-Cowpers" +
                "AF2-Processo" +
                "AF2-Refrigeração" +
                "AF2-Refrigeração_Inativo" +
                "AF2-Risco Operacional" +
                "AF2-Soprador" +
                "AF2-Tratamento de Gás" +
                "AF2-Vazamento" +
                "Altos-Fornos" +
                "Ambiência" +
                "Análise da Capacidade de Produção" +
                "Análise Físico e Química" +
                "Análise Físico e Química de Meio Ambiente" +
                "Análise Química Instrumental" +
                "Análise Química por Via Úmida" +
                "Aquisição" +
                "Aquisição/Lançamento Cabos Alta Tensão" +
                "Arquivo Central" +
                "Aspectos Ambientais" +
                "Atendimento a Legislação" +
                "Auditorias Normativas" +
                "Automação" +
                "Avaliação do Desempenho" +
                "Baldeio" +
                "Biblioteca" +
                "Cadeia de Custódia" +
                "Capacidade Técnica dos Equipamentos" +
                "Carbonização" +
                "Carregamento" +
                "Carregamento de Forno" +
                "Casa da Sombra" +
                "Casa de Vegetação" +
                "Cercas" +
                "CL1-Revestimento Carlite e Aplainamento Térmico" +
                "Combate a Pragas e Doenças" +
                "Comunicação Empresarial" +
                "Comunicação Empresarial" +
                "Condução de Brotação" +
                "Confirmação Metrológica" +
                "Conservação da Biodiversidade" +
                "Conservação do Solo" +
                "Consignação para Intervenção em Equipamentos" +
                "Controle de Dispositivos de Medição" +
                "Controle de Entrada de Madeira" +
                "Controle de Insumos Críticos" +
                "Controle de Não Conformidades" +
                "Controle de Processo" +
                "Controle de Produto Não Conforme" +
                "Controle, Qualidade e Biorredutor" +
                "Correções e Melhorias GST" +
                "Corte a Guilhotina" +
                "Corte a Plasma" +
                "Corte Longitudinal" +
                "Corte Longitudinal e Embalagem" +
                "Corte Transversal" +
                "Crescimento Seleção Rustificação" +
                "Cubagem Rigorosa" +
                "DC1-Descarbonetação de GO/GNO" +
                "Decapagem Química" +
                "Depósito de Bobinas e Chapas - DBQ" +
                "Derrubada" +
                "Descarga" +
                "Descarga de Forno" +
                "Desenvolvimento de Projetos" +
                "Devolução de Produtos" +
                "Distribuição de Fluidos" +
                "Distribuição de GAF" +
                "EBs-Esmerilhamento de Bobinas" +
                "EB1-Esmerilhamento de Bobinas" +
                "EB2-Esmerilhamento de Bobinas" +
                "Embalagem de Produto" +
                "EM2-Embalagem de Bobinas - GO/GNO" +
                "Esmerilhamento de Placas" +
                "Especificação de Aços Elétricos" +
                "Especificação de Insumos Críticos" +
                "Especificação de Matéria-Prima" +
                "Especificação de produtos" +
                "Especificação de Produtos Inoxidáveis" +
                "Estocagem de Carvão" +
                "Estradas" +
                "Expedição" +
                "Expedição de Carvão" +
                "Expedição de Produto" +
                "Fertilização (Nutrição)" +
                "Fundação Aperam Acesita" +
                "Geração de Vapor" +
                "Gerenciamento da Rotina" +
                "Gerenciamento de Projetos" +
                "Gerenciamento de Resíduos" +
                "Gerenciamento de Risco Operacional" +
                "Gerenciamento do Fluxo de Sucata" +
                "Gerir Matérias-Primas e Produtos Industriais" +
                "Gerir Processos Internos e Informações de Suprimentos" +
                "Gerir Relacionamento com Fornecedores" +
                "Gestão Apoio Técnico" +
                "Gestão da Excelência Operacional" +
                "Gestão de Bens Móveis" +
                "Gestão de Ensaios e Testes" +
                "Gestão de Infraestrutura de TI" +
                "Gestão de Riscos GST" +
                "Gestão de Segurança da Informação" +
                "Gestão de Sistema de Informação" +
                "Gestão de Sobras em Industrializador" +
                "GT-Processo" +
                "GT-Refratário" +
                "Higiene Ocupacional" +
                "ICP-Ação Preventiva no Processo" +
                "ICP-Check-list" +
                "ICP-Estocagem" +
                "ICP-Processo" +
                "ICP-Recebimento de Matérias Primas" +
                "ICP-Sistema Combate Incêndio e Explosão" +
                "ICP-Sistema de Injeção e Transporte" +
                "ICP-Sistema de Moagem e Secagem" +
                "Identificação e Preservação do Produto" +
                "Identificação e Rastreabilidade" +
                "Industrialização de Aços Elétricos" +
                "Injeção de Carvão Pulverizado" +
                "Inspeção de Aços Elétricos" +
                "Inspeção de Cintagem" +
                "Inspeção de Produtos" +
                "Inspeção de Produtos Inoxidáveis" +
                "Inventário Físico" +
                "Inventário Florestal Contínuo" +
                "Jardim Clonal" +
                "Laboratório Corrosão e Superfície" +
                "Laboratório de Eletrônica" +
                "Laboratório de Estampagem" +
                "Laboratorio de Métodos Físicos" +
                "Laboratório de Revestimento" +
                "Laboratório de Soldagem e Torção" +
                "Laboratório Integrado" +
                "Laboratórios de Ensaios Magnéticos" +
                "Laboratórios de Ensaios Mecânicos" +
                "Laboratórios de Ensaios Termomecânicos" +
                "Laminação de Chapas e Bobinas" +
                "LBs-Laminação de Bobinas" +
                "LB1-Laminação de Bobinas" +
                "LB2-Laminação de Bobinas" +
                "LB3-Laminação de Bobinas" +
                "LB4-Laminação de Bobinas" +
                "LE1-Laminação de Encruamento" +
                "LFI -Armazenamento, Preservação e Manuzeio" +
                "LFI-Armazenamento, Preservação e Manuzeio" +
                "LFI-Geral" +
                "LFI-Insumos" +
                "Logística" +
                "Logística de Transporte" +
                "Manobra Elétrica" +
                "Manutenção" +
                "Manutenção Corretiva" +
                "Manutenção da Aciaria" +
                "Manutenção da LTQ" +
                "Manutenção de Campo" +
                "Manutenção de Forno" +
                "Manutenção de Infra-Estrutura" +
                "Manutenção de 90 dias" +
                "Manutenção Elétrica" +
                "Manutenção em Instrumentação" +
                "Manutenção em Sistemas de Automação" +
                "Manutenção Mecânica" +
                "Manutenção Preventiva" +
                "Manutenção Refratária" +
                "Medição e Monitoramento de Desempenho GST" +
                "Medição e Monitoramento de Processo" +
                "Medição e Monitoramento do Produto" +
                "Medicina do Trabalho" +
                "Medidas de Controle GST" +
                "Melhoramento" +
                "Melhorias" +
                "Metalurgia do Carbono" +
                "Metrologia" +
                "Monitoramento Ambiental" +
                "Mostruários de Acabamento Superficial" +
                "Obra Civil" +
                "Ocorrência de Sinistros AT" +
                "Oficina de Manutenção de Conjuntos" +
                "Organização e Limpeza" +
                "Pátio-Abastecimento" +
                "Pátio-Beneficiamento" +
                "Pátio-Escoamento" +
                "Pátio-Estocagem" +
                "Pátio-Inventário" +
                "Pátio-Movimentação de Matérias-Primas" +
                "Pátio-Recebimento" +
                "Pátio-Risco Operacional" +
                "PBs-Preparação de Bobinas" +
                "PB1-Preparação de Bobinas" +
                "PB2-Preparação de Bobinas" +
                "PB3-Preparação de Bobinas" +
                "Planejamento de Recursos Humanos" +
                "Planejamento de Vendas" +
                "Planejamento do Negócio" +
                "Planejamento e Programação" +
                "Planejamento, Programação e Controle da Produção" +
                "Plano de Contingência" +
                "Plano de Controle" +
                "Plantio" +
                "Preparação de Cilindros" +
                "Preparação e Controle de Panelas de Lingotamento" +
                "Preparação e Manutenção Refratária de Distribuidores" +
                "Preparação e Respostas à Emergências" +
                "Preparo do Solo" +
                "Preservação de Produtos" +
                "Pré-Tratamento de Gusa Via PTG" +
                "Processos Administrativos" +
                "Processos Relacionados a Clientes" +
                "Produção de Aço Via AOD-L" +
                "Produção de Aço Via MRP-L" +
                "Produção de FeCr Via FER" +
                "Produção de Placas de Aço Via Lingotamento Contínuo" +
                "Produção de Pré-Metal Via FEAs" +
                "Programas e Projetos de Melhoria" +
                "Projeto e Desenvolvimento" +
                "Projetos de Pesquisa" +
                "Provisão de Recursos" +
                "Qualidade da Água" +
                "RBs-Recozimento e Decapagem de Bobinas" +
                "RB1-Recozimento e Decapagem de Bobinas" +
                "RB2-Recozimento e Decapagem de Bobinas" +
                "RB3-Recozimento e Decapagem de Bobinas" +
                "RB4-Recozimento e Decapagem de Bobinas" +
                "RCs-Recozimento de Bobinas em Caixa" +
                "RC2-Recozimento em Caixa de GO" +
                "RC3-Recozimento de Bobinas em Caixa" +
                "Realização Ensaios e Testes Aços Elétricos e Carbono" +
                "Reaquecimento de Placas" +
                "Receber, Armazenar e Abastecer Matérias Primas e Produtos Industriais" +
                "Receber, Armazenar e Entregar Materiais" +
                "Recebimento de Produto" +
                "Recrutamento e Seleção" +
                "Recuperação de Produto" +
                "Refino de Aço Via Forno Panela" +
                "Refino de Aço Via VOD1" +
                "Refino de Aço Via VOD2" +
                "Refrigeração Água Recirculada" +
                "Regeneração de Ácido" +
                "Relações com as Comunidades" +
                "Relações de Trabalho" +
                "Relações Trabalhistas" +
                "Requisitos de Documentação" +
                "Requisitos de Fornecedores" +
                "Requisitos de Materiais" +
                "Requisitos de Serviços" +
                "Requisitos Gerais" +
                "Requisitos Gerais - LTQ" +
                "Requisitos Legais" +
                "Resfriamento de Forno" +
                "Responsabilidade da Direção" +
                "RP1-Reparação de Bobinas de Aços Elétricos" +
                "RTs-Retíficas de Cilindros" +
                "RT1-Retífica de Cilindros" +
                "RT2-Retífica de Cilindros" +
                "RT3-Retífica de Cilindros" +
                "RT4-Retífica de Cilindros" +
                "RT5-Retífica de Cilindros" +
                "RT6-Retífica de Cilindros" +
                "RT7-Retífica de Cilindros" +
                "RT8-Retífica de Cilindros" +
                "Satisfação de Clientes" +
                "Saúde Ocupacional" +
                "Segurança do Trabalho" +
                "Segurança Patrimonial" +
                "Segurança Patrimonial - Bombeiros" +
                "Segurança Patrimonial - Fiscalização" +
                "Segurança Patrimonial - Suporte Operacional" +
                "Serviços Administrativos" +
                "Silvicultura" +
                "Sucatamento de Produto" +
                "Suprimentos para Produção" +
                "TD1 e TD2 - Recozimento e Descarbonetação de GNO" +
                "TL-Corte Longitudinal" +
                "TL2-Corte Longitudinal" +
                "TL3-Corte Longitudinal" +
                "TL7-Corte Longitudinal" +
                "Traçamento" +
                "Transporte" +
                "Transporte Interno Ferroviário" +
                "Tratamento de Insumos e Ligas" +
                "Tratamento de Utilidades Não-Conformes" +
                "Tratamento Térmico" +
                "Tratos Culturais" +
                "Treinamento" +
                "Treinamento e Desenvolvimento" +
                "TS Metalurgia Secundária" +
                "Uso de EPIs nas Atividades de Distribuição de Energia Elétrica" +
                "Documentos Não Categorizados  "};
    }

    public static String[] GetAnoBd(){
        return new String[]{
                "2006" +
                "2008" +
                "2009" +
                "2010" +
                "2011" +
                "2012" +
                "2013" +
                "2014" +
                "2015" +
                "2016" +
                "2017" +
                "2018"};
    }

    public static int[] GetVoidInt(int qtd){
        int[] qtdVoid = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            qtdVoid[i] = 0;
        }
        return qtdVoid;
    }

    public static String[] GetVoidString(int qtdId){
        String[] qtd = new String[qtdId];
        for (int i = 0; i < qtdId; i++) {
            qtd[i] = "" + i;
        }
        return qtd;
    }
}