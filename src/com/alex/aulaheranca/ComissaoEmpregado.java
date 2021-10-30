package com.alex.aulaheranca;

public class ComissaoEmpregado {

        protected final String nome;
        protected final String sobreNome;
        protected final String numSeguroSocial;
        protected double vendaBruta;
        protected double taxaComissao; //porcentagem da comissão

        public ComissaoEmpregado(String nome, String sobreNome, String numSeguroSocial, double vendaBruta, double taxaComissao) {

                if (vendaBruta < 0) { //Se Vendas Brutas for invalido, lança uma exceção
                        throw new IllegalArgumentException("Vendas Brutas Deve Ser Maior Que 0");
                }

                if (taxaComissao < 0 || taxaComissao > 1.0) {
                        throw new IllegalArgumentException("Taxa de Comissão deve ser maior que 0");
                }

                this.nome = nome;
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
        
        public double ganhoDeComissao(){
         return vendaBruta * taxaComissao;       
        }

        @Override
        public String toString() { // significa que esse método substitui um método da superclasse
                return String.format("%s: %s %s %n%s%s %n%s%.2f$ %n%s%.2f" ,"Nome Do Empregado",nome, sobreNome,
                "Numero do Seguro Social ", numSeguroSocial, "Venda Bruta ", vendaBruta, "Taxa de Comissão ", taxaComissao);
        }

        
}