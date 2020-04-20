import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {DataService} from '../../services/data.service';

@Component({
  selector: 'app-blog-item-details',
  templateUrl: './blog-item-details.component.html',
  styleUrls: ['./blog-item-details.component.scss']
})
export class BlogItemDetailsComponent implements OnInit {

  constructor(private dataService: DataService, private route: ActivatedRoute) {
  }

  public title = '';
  public image = '';
  public text = '';
  public id: number;


  ngOnInit() {
    let id: string;
    this.route.paramMap
      .subscribe(params => {
        id = params.get('id');
      });

    this.dataService.getById(id).subscribe(res => {
      this.image = res['image'];
      this.text = res['text'];
      this.title = res['title'];
    });
  }

}
