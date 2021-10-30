package com.alex.aulaheranca;

public class SalarioBaseComissaoEmpregado extends ComissaoEmpregado{

        private double salarioBase;

        public SalarioBaseComissaoEmpregado(double salarioBase, String nome, String sobreNome, String numSeguroSocial, double vendaBruta, double taxaComissao) {
                
                super(nome, sobreNome, numSeguroSocial, vendaBruta, taxaComissao);
                
                if (salarioBase < 0) {
                        throw new IllegalArgumentException("Salario Base Não Deve ser Menor Que Zero");
                }
                this.salarioBase = salarioBase;
        }

        public double getSalarioBase() {
                return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
                 if (salarioBase < 0) {
                        throw new IllegalArgumentException("Salario Base Não Deve ser Menor Que Zero");
                }
                this.salarioBase = salarioBase;
        }

        @Override
        public double ganhoDeComissao() {
                return getSalarioBase() + super.ganhoDeComissao(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String toString() {
                return String.format("%s %n%s%.2f",
                            super.toString(), "Salario Base ", getSalarioBase()); //To change body of generated methods, choose Tools | Templates.
        }

}