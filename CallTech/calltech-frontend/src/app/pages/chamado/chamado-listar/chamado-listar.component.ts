import { Component, OnInit, Injectable } from '@angular/core';
import { NzModalService } from 'ng-zorro-antd';
import { ChamadoService } from '../chamado.service';
import { Chamado } from 'src/app/util/interface/chamado';
import { RequestService } from 'src/app/util/services/request-component';

@Component({
  selector: 'app-chamado-listar',
  templateUrl: './chamado-listar.component.html',
  providers: [ChamadoService],
})
export class ChamadoListarComponent implements OnInit {

  lista: Chamado[] = [];
  /*--- MODAL -----*/
  isVisible = false;
  isVisibled = false;

  /*--- Tabela-------*/
  sortName: string | null = null;
  sortValue: string | null = null;
  searchAddress: string;
  listOfName = [{ text: 'Joe', value: 'Joe' }, { text: 'Jim', value: 'Jim' }];
  listOfAddress = [{ text: 'London', value: 'London' }, { text: 'Sidney', value: 'Sidney' }];
  listOfSearchName: string[] = [];
  listOfData: Array<{ name: string; age: number; address: string;[key: string]: string | number }> = [
    {
      name: 'John Brown',
      age: 32000,
      address: 'ERRO',
      status: 'ANDAMENTO'
    },
    {
      name: 'Jim Green',
      age: 32000,
      address: 'IMPLEMENTAÇÂO',
      status: 'ANDAMENTO'
    },
    {
      name: 'Joe Black',
      age: 32000,
      address: 'DUVIDA',
      status: 'ANDAMENTO'
    },
    {
      name: 'Jim Red',
      age: 32000,
      address: 'DUVIDA',
      status: 'ANDAMENTO'
    },
    {
      name: 'Anderson Martins',
      age: 32000,
      address: 'DUVIDA',
      status: 'ANDAMENTO'
    }
  ];
  listOfDisplayData: Array<{
    name: string;
    age: number;
    address: string;
    [key: string]: string | number
  }> = [
      ...this.listOfData
    ];


  constructor(private modalService: NzModalService,
              private chamadoService: ChamadoService,
  ) {
  }
  ngOnInit() {
  }

  sort(sort: { key: string; value: string }): void {
    this.sortName = sort.key;
    this.sortValue = sort.value;
    this.search();
  }

  filter(listOfSearchName: string[], searchAddress: string): void {
    this.listOfSearchName = listOfSearchName;
    this.searchAddress = searchAddress;
    this.search();
  }

  search(): void {
    /** filter data **/
    const filterFunc = (item: { name: string; age: number; address: string }) =>
      (this.searchAddress ? item.address.indexOf(this.searchAddress) !== -1 : true) &&
      (this.listOfSearchName.length ? this.listOfSearchName.some(name => item.name.indexOf(name) !== -1) : true);
    const data = this.listOfData.filter(item => filterFunc(item));
    /** sort data **/
    if (this.sortName && this.sortValue) {
      this.listOfDisplayData = data.sort((a, b) =>
        this.sortValue === 'ascend'
          ? a[this.sortName!] > b[this.sortName!]
            ? 1
            : -1
          : b[this.sortName!] > a[this.sortName!]
            ? 1
            : -1
      );
    } else {
      this.listOfDisplayData = data;
    }
  }
  /* ------------  MODAL MANTER -------------- */
  showModal(): void {
    this.isVisible = true;
  }

  handleOk(): void {
    this.isVisible = false;
  }

  handleCancel(): void {
    this.isVisible = false;
  }
  /* -------------- MODAL VIZUALIZAR ----------- */
  showModVisu(): void {
    this.isVisibled = true;
  }

  handleOkVisu(): void {
    this.isVisibled = false;
  }

  handleCancelVisu(): void {
    this.isVisibled = false;
  }
  listar(): void {
      this.lista = this.chamadoService.list();
  }

}
