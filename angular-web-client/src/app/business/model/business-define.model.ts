import { FieldDefine } from './field-define.model';
import { BusinessCategory } from './business-category.model';
import { FieldGroup } from './field-group.model';

export class BusinessDefine{
    id: string;
    name: string;
    wfName: string;
    startPage: string;
    memo: string;
    version: number;
    rolePrefix: string;
    description: string;
    priority: number;
    enable: boolean;
    defineVersion: number;
    defaultRoom: string;
    defaultRack: string;
    summary:string;
    defaultSecrecyLen:number;
    defaultSecrecyLevel:string;

    itemDefines:{id:number,name:string,type: string,el:string,description:string,seq: number}[];
    fields: FieldGroup[];
    businessCategory: BusinessCategory;
}