import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { User } from './user';
import { UserJson } from './user-json';
import { Headers } from '@angular/http';
import { Observable } from 'rxjs'; 
@Injectable({
  providedIn: 'root'
})
export class SampleService {

  constructor(private http:Http) { 
  console.log("userJsonserviceconstructor");
  
  }
  
  headers = new Headers(
        {
            'Content-Type': 'application/json'
        } );
    postRest(user: User): Observable<UserJson> {
        console.log( 'USER DATA JSON--->' + JSON.stringify( user ) );
        //console.log( "USER DATA body--->" + body);
        let user$ = this.http.post( 'https://localhost:8080/Loginpage1',
                JSON.stringify( user ),
            { headers: this.headers } ).map( this.mapUserLogin );
        console.log( 'CHANGED POST SERVICE INVOKE*******' + user$ )
        return user$;
    }
  
   mapUserLogin( response: Response ): UserJson {
        // The response of the API has a results
        // property with the actual results            
        console.log( 'user REST service map user trigerred DATA' + response.json().data );
        console.log( 'user REST service map user trigerred JSON' + response.json() );
        //return response.json().results.map(this.toUser)
        return toUserLogin( response.json() );
    }
    }
    function toUserLogin( r: any ): UserJson {
    console.log( 'Parsed user trigerred****:', r );
    let user = <UserJson>( {
        token: r.token,
    } );
    console.log( 'Parsed user:', user );
    return user;
}

