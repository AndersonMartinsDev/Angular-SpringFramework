import { Component } from '@angular/core';
import { NzModalService } from 'ng-zorro-antd';

@Component({
  selector: 'app-chamado-listar',
  templateUrl: './chamado-listar.component.html'
})
export class ChamadoListarComponent {
  /*--- MODAL -----*/
  isVisible = false;

  /*--- Tabela-------*/
  sortName: string | null = null;
  sortValue: string | null = null;
  searchAddress: string;
  listOfName = [{ text: 'Joe', value: 'Joe' }, { text: 'Jim', value: 'Jim' }];
  listOfAddress = [{ text: 'London', value: 'London' }, { text: 'Sidney', value: 'Sidney' }];
  listOfSearchName: string[] = [];
  listOfData: Array<{ name: string; age: number; address: string; [key: string]: string | number }> = [
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
    [key: string]: string | number  }> = [
    ...this.listOfData
  ];

  constructor(private modalService: NzModalService) {}

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
  /* ------------  REFERENTE AO MODAL -------------- */
  showModal(): void {
    this.isVisible = true;
  }

  handleOk(): void {
    this.isVisible = false;
  }

  handleCancel(): void {
    this.isVisible = false;
  }
  teste(){
    this.showModal();
  }
}
