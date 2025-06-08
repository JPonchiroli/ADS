google.charts.load('current', {
    packages: ['corechart', 'gauge', 'bar']
});
google.charts.setOnLoadCallback(drawAllCharts);

function drawAllCharts() {
    drawReceitaChart();
    drawConversaoChart();
    drawNPSChart();
    drawTicketChart();
    drawCategoriasChart();
    drawCACChart();
    drawRetornoChart();
    drawMargemChart();
    drawEstoqueChart();
    drawRecorrentesChart();
    loadClientLogos();
}

// 1. Gráfico de Receita Mensal (Linhas)
function drawReceitaChart() {
    const data = new google.visualization.DataTable();
    data.addColumn('string', 'Mês');
    data.addColumn('number', 'Receita (R$ mil)');

    const meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
    const receitas = [120, 135, 150, 145, 160, 175, 190, 185, 200, 210, 230, 250];

    for (let i = 0; i < meses.length; i++) {
        data.addRow([meses[i], receitas[i]]);
    }

    const options = {
        title: '',
        curveType: 'function',
        legend: { position: 'bottom' },
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Valor (R$ mil)' },
        colors: ['#2c3e50']
    };

    const chart = new google.visualization.LineChart(document.getElementById('chart_receita'));
    chart.draw(data, options);
}

// 2. Gráfico de Taxa de Conversão (Barras)
function drawConversaoChart() {
    const data = new google.visualization.DataTable();
    data.addColumn('string', 'Mês');
    data.addColumn('number', 'Taxa de Conversão');

    const meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
    const taxas = [22, 24, 25, 23, 26, 27, 28, 27, 29, 30, 31, 32];

    for (let i = 0; i < meses.length; i++) {
        data.addRow([meses[i], taxas[i]]);
    }

    const options = {
        title: '',
        legend: { position: 'none' },
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Taxa (%)', minValue: 0, maxValue: 50 },
        colors: ['#3498db']
    };

    const chart = new google.visualization.ColumnChart(document.getElementById('chart_conversao'));
    chart.draw(data, options);
}

// 3. Gráfico de NPS (Gauge)
function drawNPSChart() {
    const data = google.visualization.arrayToDataTable([
        ['Label', 'Value'],
        ['NPS', 72]
    ]);

    const options = {
        title: '',
        width: '100%',
        height: '100%',
        redFrom: 0,
        redTo: 50,
        yellowFrom: 50,
        yellowTo: 75,
        greenFrom: 75,
        greenTo: 100,
        minorTicks: 5,
        max: 100
    };

    const chart = new google.visualization.Gauge(document.getElementById('chart_nps'));
    chart.draw(data, options);
}

// 4. Gráfico de Ticket Médio (Linhas)
function drawTicketChart() {
    const data = new google.visualization.DataTable();
    data.addColumn('string', 'Mês');
    data.addColumn('number', 'Ticket Médio (R$)');

    const meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
    const tickets = [85, 88, 90, 92, 95, 98, 100, 102, 105, 108, 110, 115];

    for (let i = 0; i < meses.length; i++) {
        data.addRow([meses[i], tickets[i]]);
    }

    const options = {
        title: '',
        curveType: 'function',
        legend: { position: 'bottom' },
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Valor (R$)' },
        colors: ['#e74c3c']
    };

    const chart = new google.visualization.LineChart(document.getElementById('chart_ticket'));
    chart.draw(data, options);
}

// 5. Gráfico de Vendas por Categoria (Pizza)
function drawCategoriasChart() {
    const data = google.visualization.arrayToDataTable([
        ['Categoria', 'Vendas'],
        ['Eletrônicos', 35],
        ['Vestuário', 25],
        ['Alimentos', 20],
        ['Móveis', 15],
        ['Outros', 5]
    ]);

    const options = {
        title: '',
        pieHole: 0.4,
        is3D: false,
        colors: ['#2ecc71', '#3498db', '#e74c3c', '#f39c12', '#9b59b6']
    };

    const chart = new google.visualization.PieChart(document.getElementById('chart_categorias'));
    chart.draw(data, options);
}

// 6. Gráfico de CAC (Linhas)
function drawCACChart() {
    const data = new google.visualization.DataTable();
    data.addColumn('string', 'Mês');
    data.addColumn('number', 'CAC (R$)');

    const meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
    const cac = [120, 115, 110, 105, 100, 95, 90, 85, 80, 75, 70, 65];

    for (let i = 0; i < meses.length; i++) {
        data.addRow([meses[i], cac[i]]);
    }

    const options = {
        title: '',
        curveType: 'function',
        legend: { position: 'bottom' },
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Custo (R$)' },
        colors: ['#f39c12']
    };

    const chart = new google.visualization.LineChart(document.getElementById('chart_cac'));
    chart.draw(data, options);
}

// 7. Gráfico de Taxa de Retorno (Barras)
function drawRetornoChart() {
    const data = new google.visualization.DataTable();
    data.addColumn('string', 'Mês');
    data.addColumn('number', 'Taxa de Retorno');

    const meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
    const retornos = [8, 7.5, 7, 6.5, 6, 5.5, 5, 4.5, 4, 3.8, 3.5, 3.2];

    for (let i = 0; i < meses.length; i++) {
        data.addRow([meses[i], retornos[i]]);
    }

    const options = {
        title: '',
        legend: { position: 'none' },
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Taxa (%)', minValue: 0, maxValue: 10 },
        colors: ['#9b59b6']
    };

    const chart = new google.visualization.ColumnChart(document.getElementById('chart_retorno'));
    chart.draw(data, options);
}

// 8. Gráfico de Margem de Lucro (Área)
function drawMargemChart() {
    const data = new google.visualization.DataTable();
    data.addColumn('string', 'Mês');
    data.addColumn('number', 'Margem de Lucro');

    const meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
    const margens = [25, 26, 27, 27.5, 28, 28.5, 29, 29.5, 30, 30.5, 31, 31.5];

    for (let i = 0; i < meses.length; i++) {
        data.addRow([meses[i], margens[i]]);
    }

    const options = {
        title: '',
        legend: { position: 'bottom' },
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Margem (%)' },
        colors: ['#1abc9c']
    };

    const chart = new google.visualization.AreaChart(document.getElementById('chart_margem'));
    chart.draw(data, options);
}

// 9. Gráfico de Estoque Médio (Linhas)
function drawEstoqueChart() {
    const data = new google.visualization.DataTable();
    data.addColumn('string', 'Mês');
    data.addColumn('number', 'Estoque Médio');

    const meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
    const estoques = [1200, 1150, 1100, 1050, 1000, 950, 900, 850, 800, 750, 700, 650];

    for (let i = 0; i < meses.length; i++) {
        data.addRow([meses[i], estoques[i]]);
    }

    const options = {
        title: '',
        curveType: 'function',
        legend: { position: 'bottom' },
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Quantidade (unidades)' },
        colors: ['#34495e']
    };

    const chart = new google.visualization.LineChart(document.getElementById('chart_estoque'));
    chart.draw(data, options);
}

// 10. Gráfico de Clientes Recorrentes (Barras Empilhadas)
function drawRecorrentesChart() {
    const data = google.visualization.arrayToDataTable([
        ['Mês', 'Novos Clientes', 'Clientes Recorrentes'],
        ['Jan', 350, 150],
        ['Fev', 320, 170],
        ['Mar', 300, 200],
        ['Abr', 280, 220],
        ['Mai', 260, 240],
        ['Jun', 240, 260],
        ['Jul', 220, 280],
        ['Ago', 200, 300],
        ['Set', 180, 320],
        ['Out', 160, 340],
        ['Nov', 140, 360],
        ['Dez', 120, 380]
    ]);

    const options = {
        title: '',
        isStacked: true,
        hAxis: { title: 'Meses' },
        vAxis: { title: 'Número de Clientes' },
        colors: ['#3498db', '#2ecc71']
    };

    const chart = new google.visualization.ColumnChart(document.getElementById('chart_recorrentes'));
    chart.draw(data, options);
}

function loadClientLogos() {
    const gallery = document.getElementById('clientLogos');

    gallery.innerHTML = '<div class="loading">Carregando logos de clientes...</div>';

    const empresas = ['Microsoft', 'Apple', 'Amazon', 'Google', 'Samsung', 'Nike', 'Adidas', 'Coca-Cola'];

    const requests = [];

    empresas.forEach(empresa => {
        const url = `https://api.api-ninjas.com/v1/logo?name=${encodeURIComponent(empresa)}`;

        const request = fetch(url, {
            headers: {
                'X-Api-Key': 'xWZIQjKBqYb1ZjlUZLsFzA==GTh04FzqcZNUdzX8'
            }
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error(`Erro ao buscar logo para ${empresa}: ${response.status}`);
                }
                return response.json();
            })
            .then(data => {
                if (data && data.length > 0 && data[0].image) {
                    return {
                        nome: empresa,
                        logo: data[0].image
                    };
                }
                throw new Error(`Logo não encontrada para ${empresa}`);
            })
            .catch(error => {
                console.error(error);
                return {
                    nome: empresa,
                    logo: `https://via.placeholder.com/100x60?text=${empresa}`
                };
            });

        requests.push(request);
    });

    Promise.all(requests)
        .then(results => {
            gallery.innerHTML = '';

            results.forEach(cliente => {
                const img = document.createElement('img');
                img.src = cliente.logo;
                img.alt = cliente.nome;
                img.title = cliente.nome;
                img.className = 'client-logo';

                img.onerror = function () {
                    this.src = `https://via.placeholder.com/100x60?text=${cliente.nome}`;
                };

                gallery.appendChild(img);
            });
        })
        .catch(error => {
            console.error('Erro ao carregar logos:', error);
            gallery.innerHTML = `<div class="error-message">Erro ao carregar logos de clientes. ${error.message}</div>`;
        });
}