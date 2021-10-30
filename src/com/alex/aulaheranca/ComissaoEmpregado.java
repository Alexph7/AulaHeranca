package com.alex.aulaheranca;

public class ComissaoEmpregado {

        private final String nome;
        private final String sobreNome;
        private final String numSeguroSocial;
        private double vendaBruta;
        private double taxaComissao; //porcentagem da comissão

        public ComissaoEmpregado(String nombre, String sobreNome, String numSeguroSocial, double vendaBruta, double taxaComissao) {

                if (vendaBruta < 0) { //Se Vendas Brutas for invalido, lança uma exceção
                        throw new IllegalArgumentException("Vendas Brutas Deve Ser Maior Que 0");
                }

                if (taxaComissao < 0 || taxaComissao > 1.0) {
                        throw new IllegalArgumentException("Taxa de Comissão deve ser maior que 0");
                }

                this.nome = nombre;
                this.sobreNome = sobreNome;
                this.numSeguroSocial = numSeguroSocial;
                this.vendaBruta = vendaBruta;
                this.taxaComissao = taxaComissao;
        }

        public String getNome() {
                return nome;
        }

        public String getSobreNome() {
                return sobreNome;
        }

        public String getNumSeguroSocial() {
                return numSeguroSocial;
        }

        public double getVendaBruta() {
                return vendaBruta;
        }

        public void setVendaBruta(double vendaBruta) {
                if (vendaBruta < 0) { //Se Vendas Brutas for invalido, lança uma exceção
                        throw new IllegalArgumentException("Vendas Brutas Deve Ser Maior Que 0");
                }
                this.vendaBruta = vendaBruta;
        }

        public double getTaxaComissao() {
                return taxaComissao;
        }

        public void setTaxaComissao(double taxaComissao) {
                if (taxaComissao < 0 && taxaComissao > 1.0) {
                        throw new IllegalArgumentException("Taxa de Comissão deve ser maior que 0");
                }
                this.taxaComissao = taxaComissao;
        }

        public double ganhoDeComissao() {
                return getVendaBruta() * getTaxaComissao();
        }

        @Override
        public String toString() { // significa que esse método substitui um método da superclasse
                return String.format("%s: %s %s %n%s%s %n%s%.2f$ %n%s%.2f",
                            "Nome Do Empregado", getNome(), getSobreNome(),
                            "Numero do Seguro Social ", getNumSeguroSocial(),
                            "Venda Bruta ", getVendaBruta(),
                            "Taxa de Comissão ", getTaxaComissao());
        }
}