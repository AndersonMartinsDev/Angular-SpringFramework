
export class Chamado {
 numeroChamado: number;
 titulo: string;
}

export class Demanda {
  id: number;
  natureza: string;
  created: Date;
  vencimento: Date;
  fechamento: Date;
  chamado: Chamado;
  status: string;
}
